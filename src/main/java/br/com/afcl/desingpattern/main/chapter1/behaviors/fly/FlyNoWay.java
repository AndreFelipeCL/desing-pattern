package br.com.afcl.desingpattern.main.chapter1.behaviors.fly;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
