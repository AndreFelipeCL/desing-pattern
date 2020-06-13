package br.com.afcl.desingpattern.main.chapter3.beverage;

import java.math.BigDecimal;

public class DecafBeverage extends Beverage {

    public DecafBeverage() {
        this.description = "Decaf Coffee";
    }

    @Override
    public BigDecimal cost() {
        return BigDecimal.valueOf(1.05f);
    }
}
