package fabrica.ConcretePizza;

import fabrica.Pizza;

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
