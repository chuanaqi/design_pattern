package com.lai.design.pattern.dcl;

import java.io.ObjectStreamException;

/**
 * @author: laiweigeng
 * @Date: 2018/9/3 15:29
 * 双重检查锁模式：线程安全；延迟加载；效率较高；细粒度锁（推荐）
 */
public class Singleton {
    private static volatile Singleton singleton;

    private Singleton() {
        /**
         * 防止反射获取多个实例
         */
        if (null != singleton) {
            throw new RuntimeException("Singleton实例已存在");
        }
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
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
