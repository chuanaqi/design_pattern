package com.lai.design.pattern.delegate;

/**
 * @author: laiweigeng
 * @Date: 2018/9/5 14:59
 * 前端程序员
 */
public class FrontProgrammer implements IProgrammer {
    @Override
    public void doing() {
        System.out.println("系统前端开发。。。。。。");
    }
}
