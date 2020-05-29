package br.com.afcl.desingpattern.main;

import br.com.afcl.desingpattern.main.animal.Duck;
import br.com.afcl.desingpattern.main.animal.MallardDuck;
import br.com.afcl.desingpattern.main.animal.ModelDuck;
import br.com.afcl.desingpattern.main.behaviors.fly.FlyWithRocketPowered;

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
