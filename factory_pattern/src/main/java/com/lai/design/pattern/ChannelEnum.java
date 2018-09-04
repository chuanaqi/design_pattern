package com.lai.design.pattern;

/**
 * @author: laiweigeng
 * @Date: 2018/9/4 16:25
 * 支付渠道枚举
 */
public enum ChannelEnum {
    /**
     * 宝付PC支付
     */
    BAOFOO_PC("BAOFOO_PC","宝付"),

    /**
     * 微信PC支付
     */
    WEIXIN_PC("WEIXIN_PC","微信"),
    /**
     * 宝付APP支付
     */
    BAOFOO_APP("BAOFOO_APP","宝付"),

    /**
     * 微信APP支付
     */
    WEIXIN_APP("WEIXIN_APP","微信");
    private String code;

    private String message;

    ChannelEnum(String code, String message) {
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
