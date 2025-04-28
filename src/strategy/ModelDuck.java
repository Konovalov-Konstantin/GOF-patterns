package strategy;

import strategy.behaviors.impl.FlyNoWay;
import strategy.behaviors.impl.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();   // подставляется конкретная реализация интерфейса FlyBehavior
        quackBehavior = new Quack();    // подставляется конкретная реализация интерфейса QuackBehavior
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
