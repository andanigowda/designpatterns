package com.dp.behavioural.strategy;

import java.math.BigDecimal;

public interface Tax {
    BigDecimal calculate(Invoice invoice);
}