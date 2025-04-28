package decorator.concreteDecorators;

import decorator.AbstractCoffee;
import decorator.AbstractDecorator;

public class Cream extends AbstractDecorator {

    public Cream(AbstractCoffee abstractCoffee) {
        setSize(abstractCoffee.getSize());
        this.abstractCoffee = abstractCoffee;
    }

    @Override
    public String getDescription() {
        return abstractCoffee.getDescription() + ", Cream";
    }

    @Override
    public double cost() {
        switch (abstractCoffee.getSize()) {
            case SMALL -> {
                return abstractCoffee.cost() + 0.25;   // Сначала вызов cost() делегируется декорируемому объекту, а затем прибавляется стоимость добавки данного декоратора
            } case MEDIUM -> {
                return abstractCoffee.cost() + 0.4;
            } case LARGE -> {
                return abstractCoffee.cost() + 0.65;
            }
            default -> throw new IllegalStateException("Unexpected value: " + abstractCoffee.getSize());
        }
    }
}
