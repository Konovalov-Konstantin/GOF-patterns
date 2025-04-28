package fabrica.concreteFabrica;

import fabrica.ConcretePizza.ChicagoStyleCheesePizza;
import fabrica.ConcretePizza.ChicagoStylePepperoniPizza;
import fabrica.Pizza;
import fabrica.PizzaStore;

import static fabrica.PizzaStore.pizzaType.CHEESE;
import static fabrica.PizzaStore.pizzaType.PEPPERONI;

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
