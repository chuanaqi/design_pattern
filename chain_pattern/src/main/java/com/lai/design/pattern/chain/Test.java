package com.lai.design.pattern.chain;

/**
 * @author: laiweigeng
 * @Date: 2018/10/11 15:15
 */
public class Test {
    public static void main(String[] args){
        AbstractHandler abstractHandlerA = new ConcreteHandlerA();
        AbstractHandler abstractHandlerB = new ConcreteHandlerB();
        AbstractHandler abstractHandlerC = new ConcreteHandlerC();

        //设置责任链的前驱和后继
        abstractHandlerA.setSuccessor(abstractHandlerB);
        abstractHandlerB.setSuccessor(abstractHandlerC);

        for (int request = 0; request < 30; request++) {
            abstractHandlerA.handleRequest(request);
        }


    }
}
