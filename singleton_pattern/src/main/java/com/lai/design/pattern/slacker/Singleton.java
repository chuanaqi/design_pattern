package com.lai.design.pattern.slacker;

import java.io.ObjectStreamException;

/**
 * @author: laiweigeng
 * @Date: 2018/9/3 15:29
 * 懒汉模式：线程安全，同步方法效率低（不推荐）
 */
public class Singleton {
    private static Singleton INSTANCE;

    private Singleton() {
        /**
         * 防止反射获取多个实例
         */
        if (null != INSTANCE) {
            throw new RuntimeException("Singleton实例已存在");
        }
    }

    /**
     * 获取实例
     * @return
     */
    public static synchronized Singleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }

    /**
     * 防止序列化破坏单例
     * @return
     * @throws ObjectStreamException
     */
    private Object readResolve() throws ObjectStreamException {
        return Singleton.getInstance();
    }



}
