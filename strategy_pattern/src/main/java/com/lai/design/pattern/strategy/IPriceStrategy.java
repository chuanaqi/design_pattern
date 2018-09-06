package com.lai.design.pattern.strategy;

import java.math.BigDecimal;

/**
 * 价格计算接口
 * @author: laiweigeng
 * @Date: 2018/9/6 14:10
 */
public interface IPriceStrategy {
    /**
     * 获取应付价格
     * @param orgnicPrice 原始价格
     * @return
     */
    BigDecimal getPrice(BigDecimal orgnicPrice);
}
