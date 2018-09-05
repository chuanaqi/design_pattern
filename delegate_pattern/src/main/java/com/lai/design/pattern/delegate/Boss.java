package com.lai.design.pattern.delegate;

/**
 * @author: laiweigeng
 * @Date: 2018/9/5 15:11
 */
public class Boss {
    public static void main(String[] args){
        Leader leader = new Leader();
        leader.dispatch(ModuleEnum.FRONT);
        leader.dispatch(ModuleEnum.BACKEND);
    }
}
