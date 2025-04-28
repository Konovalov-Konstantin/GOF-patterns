package decorator.concreteCoffee;

import decorator.AbstractCoffee;

public class Cappuccino extends AbstractCoffee {

    public Cappuccino(Size size) {
        setSize(size);
        description = "Cappuccino " + size;
    }

    @Override
    public double cost() {          // возвращает стоимость «базового» каппучино без добавок
        switch (getSize()) {
            case SMALL -> {
                return 2.0;
            } case MEDIUM -> {
                return 2.5;
            } case LARGE -> {
                return 3.0;
            }
            default -> throw new IllegalStateException("Unexpected value: " + getSize());
        }
    }
}
