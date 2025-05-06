package strategy.example1.behaviors.impl;

import strategy.example1.behaviors.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak! (implements from Squeak.class)");
    }
}
