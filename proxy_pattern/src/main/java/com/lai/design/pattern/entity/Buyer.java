package com.lai.design.pattern.entity;

/**
 * Created by laiweigeng on 2018/8/30.
 */
public class Buyer implements Person {
    @Override
    public void information() {
        System.out.println("我是买房者");
        System.out.println("要求房屋大小不低于100平");
        System.out.println("售价小于500万");
        System.out.println("昌平朱辛庄附近");
        System.out.println("。。。。。。。。。。。。。。。。。。。。。。。。。。。。。");
    }
}
