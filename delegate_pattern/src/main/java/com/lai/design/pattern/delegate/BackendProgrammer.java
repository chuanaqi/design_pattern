package com.lai.design.pattern.delegate;

/**
 * @author: laiweigeng
 * @Date: 2018/9/5 15:00
 * 后端程序员
 */
public class BackendProgrammer implements IProgrammer{
    @Override
    public void doing() {
        System.out.println("系统后端开发。。。。。。");
    }
}
