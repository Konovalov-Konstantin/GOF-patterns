package strategy.behaviors.impl;

import strategy.behaviors.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Тишина! (implements from MuteQuack.class)");
    }
}
