package br.com.afcl.desingpattern.main.chapter3.beverage;

import java.math.BigDecimal;

public class Decaf extends Beverage {

    public Decaf() {
        this.description = "Decaf Coffee";
    }

    @Override
    public BigDecimal cost() {
        return BigDecimal.valueOf(1.05f);
    }
}
