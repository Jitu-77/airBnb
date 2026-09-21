package com.jitu.airBnb.strategy;

//import com.codingshuttle.projects.airBnbApp.entity.Inventory;

import com.jitu.airBnb.entity.Inventory;

import java.math.BigDecimal;
public interface PricingStrategy {

    BigDecimal calculatePrice(Inventory inventory);
}
