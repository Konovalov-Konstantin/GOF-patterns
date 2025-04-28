package strategy.behaviors.impl;

import strategy.behaviors.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak! (implements from Squeak.class)");
    }
}
