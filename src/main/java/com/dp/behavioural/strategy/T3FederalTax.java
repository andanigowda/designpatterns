package com.dp.behavioural.strategy;

import java.math.BigDecimal;

public class T3FederalTax implements Tax {
    public BigDecimal calculate(Invoice invoice) {
        return invoice.getCost()
                .multiply(BigDecimal.valueOf(0.07));
    }
}