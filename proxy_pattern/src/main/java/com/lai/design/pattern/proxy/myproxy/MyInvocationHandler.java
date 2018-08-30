package com.lai.design.pattern.proxy.myproxy;

import java.lang.reflect.Method;

/**
 * Created by laiweigeng on 2018/8/30.
 */
public interface MyInvocationHandler {
    public Object invoke(Object proxy,Method method,Object[] args) throws Throwable;
}
