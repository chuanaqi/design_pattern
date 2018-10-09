package com.lai.design.pattern.template;

/**
 * @author: laiweigeng
 * @Date: 2018/10/9 17:34
 */
public abstract class AbstractPayment {
    /**
     * 请求报文处理
     * @param request
     * @return
     */
    public abstract String requestParamProcess(String request);
    /**
     * 返回报文处理
     * @param response
     * @return
     */
    public abstract String responseParamProcess(String response);

    /**
     * 向第三方渠道发送请求
     * @param request
     * @return
     */
    public abstract String httpClient(String request);

    /**
     * 支付操作
     * @param request
     * @return
     */
    public String execute(String request){
        String reqData = this.requestParamProcess(request);
        String respData = this.httpClient(reqData);
        return this.responseParamProcess(respData);
    }


}
