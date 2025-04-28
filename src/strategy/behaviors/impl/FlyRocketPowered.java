package strategy.behaviors.impl;

import strategy.behaviors.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying rocket! (implements from FlyRocketPowered.class)");
    }
}
