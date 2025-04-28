package strategy;

import strategy.behaviors.impl.FlyWithWings;
import strategy.behaviors.impl.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();       // подставляется конкретная реализация интерфейса FlyBehavior
        quackBehavior = new Quack();            // подставляется конкретная реализация интерфейса QuackBehavior
    }

    @Override
    public void display() {
        System.out.println("I'm Mallard Duck");
    }
}
