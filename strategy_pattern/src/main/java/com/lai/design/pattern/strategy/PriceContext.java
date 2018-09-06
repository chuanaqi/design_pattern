package com.lai.design.pattern.strategy;

import java.math.BigDecimal;

/**
 * @author: laiweigeng
 * @Date: 2018/9/6 14:26
 */
public class PriceContext {
    private IPriceStrategy priceStrategy;

    public PriceContext(IPriceStrategy priceStrategy){
        this.priceStrategy = priceStrategy;
    }

    public BigDecimal getPrice(BigDecimal originalPrice){
        return priceStrategy.getPrice(originalPrice);
    }
}
