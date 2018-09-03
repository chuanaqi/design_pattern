package com.lai.design.pattern.proxy.cglib;

import com.lai.design.pattern.entity.Buyer;
import com.lai.design.pattern.entity.Buyer2;
import com.lai.design.pattern.entity.Person;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author: laiweigeng
 * @Date: 2018/9/3 11:15
 */
public class CglibHouseProxy implements MethodInterceptor {

    /**
     * 获取代理对象
     * @param clazz
     * @return
     * @throws Exception
     */
    public Object getInstance(Class clazz) throws Exception{

        Enhancer enhancer = new Enhancer();

        //告诉cglib，生成的子类需要继承哪个类
        enhancer.setSuperclass(clazz);
        //设置回调
        enhancer.setCallback(this);

        //第一步、生成源代码
        //第二步、编译成class文件
        //第三步、加载到JVM中，并返回被代理对象
        return enhancer.create();
    }

    /**
     *
     * @param o
     * @param method
     * @param objects
     * @param methodProxy
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy)
            throws Throwable {
        System.out.println("我是Cglib房屋中介，以下是客户信息");
        System.out.println("--------------------------");
        methodProxy.invokeSuper(o,objects);
        System.out.println("--------------------------");
        System.out.println("有意者请与我联系，电话：111121212");
        return null;
    }

    public static void main(String[] args) throws Exception{
        Object object = new CglibHouseProxy().getInstance(new Buyer2().getClass());
        Buyer2 buyer2 = (Buyer2) object;
        buyer2.information();
    }
}
