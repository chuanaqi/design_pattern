package com.lai.design.pattern.strategy;

import java.math.BigDecimal;

/**
 * VIP价格计算策略
 * @author: laiweigeng
 * @Date: 2018/9/6 14:14
 */
public class VipPriceStrategy implements IPriceStrategy {
    /**
     * VIP客户八折优惠
     * @param orgnicPrice 原始价格
     * @return
     */
    @Override
    public BigDecimal getPrice(BigDecimal orgnicPrice) {

        orgnicPrice = orgnicPrice.multiply(new BigDecimal(0.8));
        System.out.println("VIP会员八折优惠,应付："+String.valueOf(orgnicPrice.doubleValue())+"元");
        return orgnicPrice.multiply(new BigDecimal(0.8));
    }
}
