package com.lai.design.pattern.func;

import com.lai.design.pattern.payment.BaofooAppPay;
import com.lai.design.pattern.payment.BaofooPcPay;
import com.lai.design.pattern.payment.IPayment;

/**
 * @author: laiweigeng
 * @Date: 2018/9/4 16:44
 * 宝付APP端端渠道工厂
 */
public class BaofooAppFactory implements Factory {
    @Override
    public IPayment getPayment() {
        return new BaofooAppPay();
    }
}
