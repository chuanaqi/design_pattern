package com.lai.design.pattern.delegate;

/**
 * @author: laiweigeng
 * @Date: 2018/9/4 16:25
 * 开发模块枚举
 */
public enum ModuleEnum {

    /**
     * 前端开发
     */
    FRONT("FRONT","前端开发"),

    /**
     * 后端开发
     */
    BACKEND("BACKEND","后端开发");
    private String code;

    private String message;

    ModuleEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
