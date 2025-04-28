package strategy.behaviors.impl;

import strategy.behaviors.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I cant't fly! (implements from FlyNoWay.class)");
    }
}
