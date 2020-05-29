package br.com.afcl.desingpattern.main.behaviors.quack;

public class Quack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
