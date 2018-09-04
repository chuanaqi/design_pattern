package com.lai.design.pattern.func;

import com.lai.design.pattern.payment.BaofooPcPay;
import com.lai.design.pattern.payment.IPayment;

/**
 * @author: laiweigeng
 * @Date: 2018/9/4 16:44
 * 宝付PC端渠道工厂
 */
public class BaofooPcFactory implements Factory {
    @Override
    public IPayment getPayment() {
        return new BaofooPcPay();
    }
}
