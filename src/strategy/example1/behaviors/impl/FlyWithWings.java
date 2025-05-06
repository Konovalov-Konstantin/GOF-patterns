package strategy.example1.behaviors.impl;

import strategy.example1.behaviors.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I,m flying! (implements from FlyWithWings.class)");
    }
}
