package com.lai.design.pattern.strategy;

import java.math.BigDecimal;

/**
 * @author: laiweigeng
 * @Date: 2018/9/6 14:34
 */
public class Client {
    public static void main(String[] args) {
        IPriceStrategy nonVipPriceStrategy = new NonVipPriceStrategy();
        IPriceStrategy vipPriceStrategy = new VipPriceStrategy();
        IPriceStrategy supperVipPriceStrategy = new SupperVipPriceStrategy();

        PriceContext nonpriceContext = new PriceContext(nonVipPriceStrategy);
        PriceContext vippriceContext = new PriceContext(vipPriceStrategy);
        PriceContext supperVippriceContext = new PriceContext(supperVipPriceStrategy);

        BigDecimal orgnicPrice = new BigDecimal(100);
        nonpriceContext.getPrice(orgnicPrice);
        vippriceContext.getPrice(orgnicPrice);
        supperVippriceContext.getPrice(orgnicPrice);


    }
}
