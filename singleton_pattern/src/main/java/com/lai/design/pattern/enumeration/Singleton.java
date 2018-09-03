package com.lai.design.pattern.enumeration;

/**
 * @author: laiweigeng
 * @Date: 2018/9/3 15:29
 * 枚举模式：线程安全；天然防止反射及序列化漏洞（推荐）
 */
public enum Singleton {
    /**
     * 单例实例
     */
    INSTANCE;
    private Singleton() {}
    private void doingSomeThing(){
        System.out.println(this);
    }
    public static void main(String[] args) throws Throwable{
        Singleton singleton1 = Singleton.INSTANCE;
        Singleton singleton2 = Singleton.INSTANCE;
        singleton1.doingSomeThing();
        singleton2.doingSomeThing();
        System.out.println(singleton1 == singleton2);
    }
}
