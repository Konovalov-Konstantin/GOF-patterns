package strategy.example1.behaviors.impl;

import strategy.example1.behaviors.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I cant't fly! (implements from FlyNoWay.class)");
    }
}
