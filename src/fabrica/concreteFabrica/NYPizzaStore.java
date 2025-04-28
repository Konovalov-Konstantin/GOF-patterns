package fabrica.concreteFabrica;

import fabrica.ConcretePizza.NYStyleCheesePizza;
import fabrica.ConcretePizza.NYStylePepperoniPizza;
import fabrica.Pizza;
import fabrica.PizzaStore;

import static fabrica.PizzaStore.pizzaType.CHEESE;
import static fabrica.PizzaStore.pizzaType.PEPPERONI;

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
