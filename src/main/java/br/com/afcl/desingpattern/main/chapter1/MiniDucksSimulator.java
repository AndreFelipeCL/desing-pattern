package br.com.afcl.desingpattern.main.chapter1;

import br.com.afcl.desingpattern.main.chapter1.animal.Duck;
import br.com.afcl.desingpattern.main.chapter1.animal.MallardDuck;
import br.com.afcl.desingpattern.main.chapter1.animal.ModelDuck;
import br.com.afcl.desingpattern.main.chapter1.behaviors.fly.FlyWithRocketPowered;

public class MiniDucksSimulator {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performQuack();
        mallardDuck.performFly();

        Duck modelDuck = new ModelDuck();
        modelDuck.performQuack();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyWithRocketPowered());
        modelDuck.performFly();
    }
}
