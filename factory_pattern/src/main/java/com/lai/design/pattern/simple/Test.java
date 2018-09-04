package com.lai.design.pattern.simple;

import com.lai.design.pattern.ChannelEnum;
import com.lai.design.pattern.payment.IPayment;

/**
 * @author: laiweigeng
 * @Date: 2018/9/4 13:52
 */
public class Test {

    public static void main(String[] args){
        IPayment payment = new SimpleFactory().getPayment(ChannelEnum.WEIXIN_APP);
        payment.bindCard();
    }
}
