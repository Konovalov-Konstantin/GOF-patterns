package factory;

public abstract class PizzaStore {      // пиццерия

    public enum pizzaType {CHEESE, PEPPERONI}

    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);      // вызов абстрактного метода, который реализован в конкретной фабрике
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    /* Фабричный метод объявляется абстрактным, чтобы субклассы предоставили реализацию создания объектов.
    * Может быть не абсрактным и по умолчанию создавать некий конкретный продукт, что позволит создавать продукты даже
    * при отсутствии субклассов у класса-создателя   */
    protected abstract Pizza createPizza(String type);    // реализуется в конкретных субклассах-фабриках (ChicagoPizzaStore, NYPizzaStore)
}
