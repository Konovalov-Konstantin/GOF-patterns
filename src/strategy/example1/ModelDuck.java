package strategy.example1;

import strategy.example1.behaviors.impl.FlyNoWay;
import strategy.example1.behaviors.impl.Quack;

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
