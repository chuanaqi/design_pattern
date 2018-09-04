package com.lai.design.pattern.simple;

import com.lai.design.pattern.ChannelEnum;
import com.lai.design.pattern.payment.*;

/**
 * @author: laiweigeng
 * @Date: 2018/9/4 14:09
 */
public class SimpleFactory {

    /**
     * 获取渠道实例
     * @param channel
     * @return
     */
    public IPayment getPayment(ChannelEnum channel){
        if(channel == null){
            return null;
        }
        switch (channel){
            case BAOFOO_PC:
                return new BaofooPcPay();
            case WEIXIN_PC:
                return new WeiXinPcPay();
            case BAOFOO_APP:
                return new BaofooAppPay();
            case WEIXIN_APP:
                return new WeiXinAppPay();
            default:
                return null;
        }
    }
}
