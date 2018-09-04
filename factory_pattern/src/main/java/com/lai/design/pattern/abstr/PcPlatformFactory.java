package com.lai.design.pattern.abstr;

import com.lai.design.pattern.payment.BaofooPcPay;
import com.lai.design.pattern.payment.IPayment;
import com.lai.design.pattern.payment.WeiXinPcPay;

/**
 * @author: laiweigeng
 * @Date: 2018/9/4 18:00
 * PC支付平台工厂
 */
public class PcPlatformFactory implements AbstractFactory{
    @Override
    public IPayment getWeixinPay() {
        return new WeiXinPcPay();
    }

    @Override
    public IPayment getBaofooPay() {
        return new BaofooPcPay();
    }
}
