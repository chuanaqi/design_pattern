package com.lai.design.pattern.proxy.myproxy;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;

/**
 * Created by laiweigeng on 2018/8/30.
 * 实现代码生成、编译、动态加载到JVM
 */
public class MyClassLoader extends ClassLoader {
    private File baseDir;

    public MyClassLoader(){
        String basePath = MyClassLoader.class.getResource("").getPath();
        this.baseDir = new java.io.File(basePath);
    }
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        String calssName = MyClassLoader.class.getPackage().getName()+"."+name;
        if(baseDir != null){
            File classFile = new File(baseDir,name.replace("\\.","/")+".class");
            if(classFile.exists()){
                FileInputStream in = null;
                ByteArrayOutputStream out = null;
                try{
                    in = new FileInputStream(classFile);
                    out = new ByteArrayOutputStream();
                    byte[] buff = new byte[1024];
                    int len;
                    while ((len = in.read(buff)) != -1){
                        out.write(buff,0,len);
                    }
                    return  defineClass(calssName,out.toByteArray(),0,out.size());
                }catch (Exception e){
                    e.printStackTrace();
                }finally {
                    colseStream(in);
                    colseStream(out);
                    classFile.delete();
                }

            }
        }
        return null;
    }

    public void colseStream(Closeable closeable){
        try {
            if(closeable != null){
                closeable.close();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
