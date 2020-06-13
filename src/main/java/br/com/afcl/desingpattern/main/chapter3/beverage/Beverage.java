package br.com.afcl.desingpattern.main.chapter3.beverage;

import lombok.Getter;

import java.math.BigDecimal;

public abstract class Beverage {

	@Getter protected String description = "Unknown Beverage";

	public abstract BigDecimal cost();

	@Override public String toString() {
		return getDescription() + " - $" + cost().setScale(2, BigDecimal.ROUND_HALF_EVEN);
	}
}
