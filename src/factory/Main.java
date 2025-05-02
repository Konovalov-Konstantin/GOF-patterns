package factory;

import factory.concreteFabrica.ChicagoPizzaStore;
import factory.concreteFabrica.NYPizzaStore;

public class Main {
    public static void main(String[] args) {

        ChicagoPizzaStore chicagoPizzaStore = new ChicagoPizzaStore();       // конфкретная фабрика
        Pizza cheesePizza = chicagoPizzaStore.orderPizza("cheese");     // вызов метода из родительского абстрактного класса PizzaStore

        NYPizzaStore nYPizzaStore = new NYPizzaStore();                      // конфкретная фабрика
        Pizza pepperoniPizza = nYPizzaStore.orderPizza("pepperoni");    // вызов метода из родительского абстрактного класса PizzaStore

        System.out.println(cheesePizza.getName());
        System.out.println(pepperoniPizza.getName());
    }
}
