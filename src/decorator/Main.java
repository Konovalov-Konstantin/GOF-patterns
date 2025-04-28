package decorator;

import decorator.concreteCoffee.Espresso;
import decorator.concreteCoffee.Cappuccino;
import decorator.concreteDecorators.Caramel;
import decorator.concreteDecorators.Vanil;

public class Main {
    public static void main(String[] args) {

        /* маленький эсрессо без добавок */
        AbstractCoffee espresso = new Espresso(AbstractCoffee.Size.SMALL);
        System.out.println(espresso.getDescription() + " $" + espresso.cost());

        System.out.println("***\n");

        /* большой каппучино с добавлением карамели и ванили */
        AbstractCoffee cappuccino = new Cappuccino(AbstractCoffee.Size.LARGE);
        cappuccino = new Caramel(cappuccino);   // добавили карамель
        cappuccino = new Vanil(cappuccino);     // добавили ваниль
        System.out.println(cappuccino.getDescription() + " $" + cappuccino.cost());
    }
}
