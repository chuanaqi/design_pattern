package com.lai.design.pattern.strategy;

import java.math.BigDecimal;

/**
 * 超级VIP价格计算策略
 * @author: laiweigeng
 * @Date: 2018/9/6 14:14
 */
public class SupperVipPriceStrategy implements IPriceStrategy {
    /**
     * VIP客户五折优惠
     * @param orgnicPrice 原始价格
     * @return
     */
    @Override
    public BigDecimal getPrice(BigDecimal orgnicPrice) {
        orgnicPrice = orgnicPrice.multiply(new BigDecimal(0.5));
        System.out.println("超级VIP会员五折优惠,应付："+String.valueOf(orgnicPrice.doubleValue())+"元");
        return orgnicPrice;
    }
}
