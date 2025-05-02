package factory.concreteFabrica;

import factory.ConcretePizza.ChicagoStyleCheesePizza;
import factory.ConcretePizza.ChicagoStylePepperoniPizza;
import factory.Pizza;
import factory.PizzaStore;

import static factory.PizzaStore.pizzaType.CHEESE;
import static factory.PizzaStore.pizzaType.PEPPERONI;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {

        Pizza pizza;

        if (type.equalsIgnoreCase(CHEESE.name())) {
            pizza = new ChicagoStyleCheesePizza();
        } else if (type.equalsIgnoreCase(PEPPERONI.name())) {
            pizza = new ChicagoStylePepperoniPizza();
        } else {
            return null;
        }
        return pizza;
    }
}
