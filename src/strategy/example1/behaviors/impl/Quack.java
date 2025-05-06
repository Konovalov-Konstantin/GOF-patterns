package strategy.example1.behaviors.impl;

import strategy.example1.behaviors.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack! (implements from Quack.class)");
    }
}
