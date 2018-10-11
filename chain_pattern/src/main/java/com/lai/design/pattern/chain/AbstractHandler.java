package com.lai.design.pattern.chain;

/**处理请示的接口
 * @author: laiweigeng
 * @Date: 2018/10/11 15:04
 */
public abstract class AbstractHandler {
    /**
     * 继任者
     */
    protected AbstractHandler successor;

    public AbstractHandler getSuccessor() {
        return successor;
    }

    public void setSuccessor(AbstractHandler successor) {
        this.successor = successor;
    }

    /**
     * 处理请求
     * @param request
     */
    public abstract void handleRequest(int request);

}
