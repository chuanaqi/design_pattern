package com.lai.design.pattern.proxy.myproxy;

import java.lang.reflect.Method;

/**
 * @author laiweigeng
 * @Date: 2018/8/30 19:50
 */
public interface MyInvocationHandler {
    /**
     * 代理方法调用
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     *
     */
    Object invoke(Object proxy,Method method,Object[] args) throws Throwable;
}
