package factory.example1.ConcretePizza;

import factory.example1.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza() {
        name = "ChicagoStyleCheesePizza";
        sauce = "Tomato Sauce";
    }

    @Override
    protected void cut() {
        System.out.println("Нарезка пиццы квадратами");
    }
}
