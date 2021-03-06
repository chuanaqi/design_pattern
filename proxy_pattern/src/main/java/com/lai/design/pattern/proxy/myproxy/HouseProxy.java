package com.lai.design.pattern.proxy.myproxy;

import com.lai.design.pattern.entity.Buyer;
import com.lai.design.pattern.entity.Person;

import java.lang.reflect.Method;

/**
 * @author laiweigeng
 * @Date: 2018/8/30 19:50
 */
public class HouseProxy implements MyInvocationHandler {
    private Person target;


    public Object getInstance(Person person) throws Exception{
        this.target = person;
        Class clazz = target.getClass();
        return MyProxy.newProxyInstance(new MyClassLoader(),clazz.getInterfaces(),this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("我是房屋中介，以下是客户信息");
        System.out.println("--------------------------");
        method.invoke(this.target,args);
        System.out.println("--------------------------");
        System.out.println("有意者请与我联系，电话：111121212");
        return null;
    }

    public static void main(String[] args) throws Exception{
        Object object = new HouseProxy().getInstance(new Buyer());
        Person person = (Person) object;
        person.information();
    }
}
