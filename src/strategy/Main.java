package strategy;

import strategy.behaviors.impl.FlyRocketPowered;

public class Main {
    public static void main(String[] args) {

        Duck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();
        System.out.println("\n***\n");
        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.performQuack();
        modelDuck.setFlyBehavior(new FlyRocketPowered());   // динамическое изменение поведения через setFlyBehavior
        modelDuck.performFly();

    }
}
