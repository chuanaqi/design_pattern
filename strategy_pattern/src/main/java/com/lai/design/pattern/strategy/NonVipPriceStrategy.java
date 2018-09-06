package com.lai.design.pattern.strategy;

import java.math.BigDecimal;

/**
 * 非VIP价格计算策略
 * @author: laiweigeng
 * @Date: 2018/9/6 14:14
 */
public class NonVipPriceStrategy implements IPriceStrategy {
    /**
     * 普通客户无优惠
     * @param orgnicPrice 原始价格
     * @return
     */
    @Override
    public BigDecimal getPrice(BigDecimal orgnicPrice) {
        System.out.println("普通客户无优惠,应付："+String.valueOf(orgnicPrice.doubleValue())+"元");
        return orgnicPrice;
    }
}
