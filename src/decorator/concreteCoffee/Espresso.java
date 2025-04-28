package decorator.concreteCoffee;

import decorator.AbstractCoffee;

public class Espresso extends AbstractCoffee {        // Все классы конкретных напитков расширяют Beverage

    public Espresso(Size size) {
        setSize(size);
        description = "Espresso " + getSize();
    }

    @Override
    public double cost() {              // возвращает стоимость «базового» эспрессо без добавок
        switch (getSize()) {
            case SMALL -> {
                return 1.5;
            } case MEDIUM -> {
                return 2.0;
            } case LARGE -> {
                return 2.5;
            }
            default -> throw new IllegalStateException("Unexpected value: " + getSize());
        }
    }
}
