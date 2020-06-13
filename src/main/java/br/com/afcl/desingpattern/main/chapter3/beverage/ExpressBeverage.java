package br.com.afcl.desingpattern.main.chapter3.beverage;

import java.math.BigDecimal;

public class ExpressBeverage extends Beverage {

    public ExpressBeverage() {
        this.description = "Café Espresso";
    }

    @Override
    public BigDecimal cost() {
        return BigDecimal.valueOf(1.99f);
    }
}
