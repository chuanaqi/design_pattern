package com.lai.design.pattern.func;

import com.lai.design.pattern.ChannelEnum;
import com.lai.design.pattern.payment.IPayment;

/**
 * @author: laiweigeng
 * @Date: 2018/9/4 16:43
 */
public interface Factory {
    /**
     * 获取渠道实例
     * @return
     */
    IPayment getPayment();
}
