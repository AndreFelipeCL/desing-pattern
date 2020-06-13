package br.com.afcl.desingpattern.main.chapter3.condiment;

import br.com.afcl.desingpattern.main.chapter3.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
