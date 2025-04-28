package strategy.behaviors.impl;

import strategy.behaviors.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I,m flying! (implements from FlyWithWings.class)");
    }
}
