package br.com.afcl.desingpattern.main.chapter1.behaviors.quack;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
