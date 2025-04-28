package strategy;

import strategy.behaviors.FlyBehavior;
import strategy.behaviors.QuackBehavior;

public abstract class Duck {

    FlyBehavior flyBehavior;            // в интерфейс вынесено поведение, которое может изменяться в подклассах
    QuackBehavior quackBehavior;        // в интерфейс вынесено поведение, которое может изменяться в подклассах

    public Duck() {
    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    };

    public void performQuack() {
        quackBehavior.quack();
    };

    public void swim() {
        System.out.println("I'm swimming duck");
    }

    public void setFlyBehavior(FlyBehavior fb) {
        this.flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        this.quackBehavior = qb;
    }
}
