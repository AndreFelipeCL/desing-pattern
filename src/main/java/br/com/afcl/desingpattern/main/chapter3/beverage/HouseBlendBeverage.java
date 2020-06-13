package br.com.afcl.desingpattern.main.chapter3.beverage;

import java.math.BigDecimal;

public class HouseBlendBeverage extends Beverage {

    public HouseBlendBeverage() {
        this.description = "House Blend Coffee";
    }

    @Override
    public BigDecimal cost() {
        return BigDecimal.valueOf(0.89f);
    }
}
