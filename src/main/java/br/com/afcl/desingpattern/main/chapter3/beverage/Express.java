package br.com.afcl.desingpattern.main.chapter3.beverage;

import java.math.BigDecimal;

public class Express extends Beverage {

    public Express() {
        this.description = "Express Coffee";
    }

    @Override
    public BigDecimal cost() {
        return BigDecimal.valueOf(1.99f);
    }
}
