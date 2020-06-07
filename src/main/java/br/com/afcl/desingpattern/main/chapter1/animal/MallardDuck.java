package br.com.afcl.desingpattern.main.chapter1.animal;

import br.com.afcl.desingpattern.main.chapter1.behaviors.fly.FlyWithWings;
import br.com.afcl.desingpattern.main.chapter1.behaviors.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        this.setFlyBehavior(new FlyWithWings());
        this.setQuackBehavior(new Quack());
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard Duck");
    }
}
