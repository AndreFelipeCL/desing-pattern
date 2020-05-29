package br.com.afcl.desingpattern.main.animal;

import br.com.afcl.desingpattern.main.behaviors.fly.FlyNoWay;
import br.com.afcl.desingpattern.main.behaviors.quack.Quack;

public class ModelDuck extends Duck {

    public ModelDuck(){
        this.setFlyBehavior(new FlyNoWay());
        this.setQuackBehavior(new Quack());
    }
    @Override
    public void display() {
        System.out.println("I'm a model duck!");
    }
}
