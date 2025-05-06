package strategy.example1.behaviors.impl;

import strategy.example1.behaviors.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying rocket! (implements from FlyRocketPowered.class)");
    }
}
