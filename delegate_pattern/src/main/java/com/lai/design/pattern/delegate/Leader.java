package com.lai.design.pattern.delegate;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: laiweigeng
 * @Date: 2018/9/5 15:01
 * 项目经理
 */
public class Leader{

    private Map<ModuleEnum,IProgrammer> programmers = new HashMap<ModuleEnum,IProgrammer>();

    public Leader(){
        programmers.put(ModuleEnum.FRONT,new FrontProgrammer());
        programmers.put(ModuleEnum.BACKEND,new BackendProgrammer());
    }


    /**
     * 分配任务
     * @param module
     */
    public void dispatch(ModuleEnum module) {
        if(module == null){
            throw new RuntimeException("ModuleEnum is null");
        }
        programmers.get(module).doing();
    }
}
