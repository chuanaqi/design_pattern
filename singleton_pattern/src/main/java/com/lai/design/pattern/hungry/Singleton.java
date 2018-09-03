package com.lai.design.pattern.hungry;

import java.io.ObjectStreamException;

/**
 * @author: laiweigeng
 * @Date: 2018/9/3 15:29
 * 饿汉模式：写法简单，线程安全，类装载时实例化，会造成内存浪费（不推荐）
 */
public class Singleton {
    private final static Singleton singleton = new Singleton();

    private Singleton() {
        /**
         * 防止反射获取多个实例
         */
        if (null != singleton) {
            throw new RuntimeException("Singleton实例已存在");
        }
    }

    public static Singleton getInstance(){
        return singleton;
    }

    /**
     * 防止序列化破坏单例
     * @return
     * @throws ObjectStreamException
     */
    private Object readResolve() throws ObjectStreamException {
        return singleton;
    }
}
