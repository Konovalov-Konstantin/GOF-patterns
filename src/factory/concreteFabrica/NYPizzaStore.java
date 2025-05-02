package factory.concreteFabrica;

import factory.ConcretePizza.NYStyleCheesePizza;
import factory.ConcretePizza.NYStylePepperoniPizza;
import factory.Pizza;
import factory.PizzaStore;

import static factory.PizzaStore.pizzaType.CHEESE;
import static factory.PizzaStore.pizzaType.PEPPERONI;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {

        Pizza pizza;

        if (type.equalsIgnoreCase(CHEESE.name())) {
            pizza = new NYStyleCheesePizza();
        } else if (type.equalsIgnoreCase(PEPPERONI.name())) {
            pizza = new NYStylePepperoniPizza();
        } else {
            return null;
        }
        return pizza;
    }
}
