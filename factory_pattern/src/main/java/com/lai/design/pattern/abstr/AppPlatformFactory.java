package com.lai.design.pattern.abstr;

import com.lai.design.pattern.payment.BaofooAppPay;
import com.lai.design.pattern.payment.IPayment;
import com.lai.design.pattern.payment.WeiXinAppPay;

/**
 * @author: laiweigeng
 * @Date: 2018/9/4 18:00
 * App支付平台工厂
 */
public class AppPlatformFactory implements AbstractFactory{
    @Override
    public IPayment getWeixinPay() {
        return new WeiXinAppPay();
    }

    @Override
    public IPayment getBaofooPay() {
        return new BaofooAppPay();
    }
}
