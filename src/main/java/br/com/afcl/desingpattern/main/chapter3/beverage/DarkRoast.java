package br.com.afcl.desingpattern.main.chapter3.beverage;

import java.math.BigDecimal;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        this.description = "Dark Roast Coffee";
    }

    @Override
    public BigDecimal cost() {
        return BigDecimal.valueOf(0.99f);
    }
}
