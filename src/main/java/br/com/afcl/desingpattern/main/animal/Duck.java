package br.com.afcl.desingpattern.main.animal;

import br.com.afcl.desingpattern.main.behaviors.fly.FlyBehavior;
import br.com.afcl.desingpattern.main.behaviors.quack.QuackBehavior;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
public abstract class Duck {
    @Setter
    private FlyBehavior flyBehavior;
    @Setter
    private QuackBehavior quackBehavior;

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim(){
        System.out.println("All ducks float, even decoys!");
    }
}
