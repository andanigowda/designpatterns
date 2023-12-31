package com.dp.behavioural.strategy;

import java.math.BigDecimal;

public class T1VatTax implements Tax {
    public BigDecimal calculate(Invoice invoice) {
        return invoice.getCost()
                .multiply(BigDecimal.valueOf(0.10));
    }
}