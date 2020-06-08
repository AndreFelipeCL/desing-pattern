package br.com.afcl.desingpattern.main.chapter1.behaviors.fly;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying!");
    }
}
