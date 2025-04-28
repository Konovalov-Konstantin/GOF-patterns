package strategy.behaviors.impl;

import strategy.behaviors.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack! (implements from Quack.class)");
    }
}
