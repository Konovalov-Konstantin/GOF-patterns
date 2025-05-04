package factory.example1.concreteFabrica;

import factory.example1.ConcretePizza.ChicagoStyleCheesePizza;
import factory.example1.ConcretePizza.ChicagoStylePepperoniPizza;
import factory.example1.Pizza;
import factory.example1.PizzaStore;

import static factory.example1.PizzaStore.pizzaType.CHEESE;
import static factory.example1.PizzaStore.pizzaType.PEPPERONI;

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
