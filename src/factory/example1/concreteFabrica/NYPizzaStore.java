package factory.example1.concreteFabrica;

import factory.example1.ConcretePizza.NYStyleCheesePizza;
import factory.example1.ConcretePizza.NYStylePepperoniPizza;
import factory.example1.Pizza;
import factory.example1.PizzaStore;

import static factory.example1.PizzaStore.pizzaType.CHEESE;
import static factory.example1.PizzaStore.pizzaType.PEPPERONI;

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
