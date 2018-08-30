package com.lai.design.pattern.proxy.myproxy;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import javax.tools.JavaCompiler.CompilationTask;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Created by laiweigeng on 2018/8/30.
 * 生成代理对象
 */
public class MyProxy {
    private static String ln = "\r\n";

    public static Object newProxyInstance(MyClassLoader classLoader,Class<?>[] interfaces,MyInvocationHandler invacationHandler){
        try {
            //生成源代码
            String proxySrc =generateSrc(interfaces[0]);

            //源代码输出到磁盘，保存为java文件
            String filePath = MyProxy.class.getResource("").getPath();
            File file = new File(filePath + "$Proxy0.java");
            FileWriter fw = new FileWriter(file);
            fw.write(proxySrc);
            fw.flush();
            fw.close();

            //编译源代码、生成.class文件
            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager manager = compiler.getStandardFileManager(null, null, null);
            Iterable iterable = manager.getJavaFileObjects(file);

            CompilationTask task = compiler.getTask(null, manager, null, null, null, iterable);
            task.call();
            manager.close();

            //将class文件中的内容，动态加载到JVM中来,返回代理后的代理对象
            Class proxyClass = classLoader.findClass("$Proxy0");
            Constructor c = proxyClass.getConstructor(MyInvocationHandler.class);
            file.delete();

            return c.newInstance(invacationHandler);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    private static String generateSrc(Class<?> interfaces){
        StringBuffer src = new StringBuffer();
        String packagePath = MyProxy.class.getPackage().getName();
        src.append("package "+packagePath+";" + ln);
        src.append("import java.lang.reflect.Method;" + ln);
        src.append("public class $Proxy0 implements " + interfaces.getName() + "{" + ln);
        src.append("MyInvocationHandler h;" + ln);

        src.append("public $Proxy0(MyInvocationHandler h) {" + ln);
        src.append("this.h = h;" + ln);
        src.append("}" + ln);

        for (Method m : interfaces.getMethods()) {
            src.append("public " + m.getReturnType().getName() + " " + m.getName() + "(){" + ln);

            src.append("try{" + ln);
            src.append("Method m = " + interfaces.getName() + ".class.getMethod(\"" +m.getName()+"\",new Class[]{});" + ln);
            src.append("this.h.invoke(this,m,null);" + ln);
            src.append("}catch(Throwable e){e.printStackTrace();}" + ln);
            src.append("}" + ln);
        }

        src.append("}");

        return src.toString();
    }

}
