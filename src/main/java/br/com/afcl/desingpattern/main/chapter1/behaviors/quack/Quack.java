package br.com.afcl.desingpattern.main.chapter1.behaviors.quack;

public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
