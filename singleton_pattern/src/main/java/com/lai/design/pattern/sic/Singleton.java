package com.lai.design.pattern.sic;

import java.io.ObjectStreamException;

/**
 * @author: laiweigeng
 * @Date: 2018/9/3 15:29
 * 静态内部类模式：线程安全；延迟加载；效率较高（推荐）
 */
public class Singleton {
    private Singleton() {}

    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }

    /**
     * 防止序列化破坏单例
     * @return
     * @throws ObjectStreamException
     */
    private Object readResolve() throws ObjectStreamException {
        return SingletonInstance.INSTANCE;
    }

    public static void main(String[] args) throws Throwable{
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1);
        System.out.println(singleton2);
        System.out.println(singleton1 == singleton2);
    }
}
