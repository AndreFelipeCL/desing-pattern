/*
 * @(#)StarbuzzCoffee.java 1.0 13/06/2020
 *
 * Copyright (c) 2019, Embraer. All rights reserved. Embraer S/A
 * proprietary/confidential. Use is subject to license terms.
 */
package br.com.afcl.desingpattern.main.chapter3;

import br.com.afcl.desingpattern.main.chapter3.beverage.Beverage;
import br.com.afcl.desingpattern.main.chapter3.beverage.DarkRoast;
import br.com.afcl.desingpattern.main.chapter3.beverage.Express;
import br.com.afcl.desingpattern.main.chapter3.beverage.HouseBlend;
import br.com.afcl.desingpattern.main.chapter3.condiment.Mocha;
import br.com.afcl.desingpattern.main.chapter3.condiment.Soy;
import br.com.afcl.desingpattern.main.chapter3.condiment.Whip;

/**
 * @author andrelei - André Felipe C. Leite
 * @version 1.0 13/06/2020
 */
public class StarbuzzCoffee {

	public static void main(String[] args) {

		Beverage express = new Express();
		System.out.println(express);

		Beverage darkRoast = new DarkRoast();
		darkRoast = new Mocha(darkRoast);
		darkRoast = new Mocha(darkRoast);
		darkRoast = new Whip(darkRoast);
		System.out.println(darkRoast);

		Beverage houseBlend = new HouseBlend();
		houseBlend = new Soy(houseBlend);
		houseBlend = new Mocha(houseBlend);
		houseBlend = new Whip(houseBlend);
		System.out.println(houseBlend);
	}
}
