package strategy.example1;

import strategy.example1.behaviors.impl.FlyWithWings;
import strategy.example1.behaviors.impl.Quack;

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
