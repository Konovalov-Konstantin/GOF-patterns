package strategy.example1.behaviors.impl;

import strategy.example1.behaviors.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Тишина! (implements from MuteQuack.class)");
    }
}
