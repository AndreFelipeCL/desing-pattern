/*
 * @(#)Mocha.java 1.0 13/06/2020
 *
 * Copyright (c) 2019, Embraer. All rights reserved. Embraer S/A
 * proprietary/confidential. Use is subject to license terms.
 */
package br.com.afcl.desingpattern.main.chapter3.condiment;

import br.com.afcl.desingpattern.main.chapter3.beverage.Beverage;

import java.math.BigDecimal;

/**
 * @author andrelei - André Felipe C. Leite
 * @version 1.0 13/06/2020
 */
public class Milk extends CondimentDecorator {

	Beverage beverage;

	public Milk(final Beverage beverage) {
		this.beverage = beverage;
	}

	@Override public String getDescription() {
		return this.beverage.getDescription() + " -> Milk";
	}

	@Override public BigDecimal cost() {
		return this.beverage.cost().add(BigDecimal.valueOf(0.10f));
	}
}
