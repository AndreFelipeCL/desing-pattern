package br.com.afcl.desingpattern.main.chapter1.animal;

import br.com.afcl.desingpattern.main.chapter1.behaviors.fly.FlyNoWay;
import br.com.afcl.desingpattern.main.chapter1.behaviors.quack.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        this.setFlyBehavior(new FlyNoWay());
        this.setQuackBehavior(new Quack());
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck!");
    }
}
