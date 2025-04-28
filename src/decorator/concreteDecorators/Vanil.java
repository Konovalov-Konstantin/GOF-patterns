package decorator.concreteDecorators;

import decorator.AbstractCoffee;
import decorator.AbstractDecorator;

public class Vanil extends AbstractDecorator {

    public Vanil(AbstractCoffee abstractCoffee) {
        setSize(abstractCoffee.getSize());
        this.abstractCoffee = abstractCoffee;
    }

    @Override
    public String getDescription() {
        return abstractCoffee.getDescription() + ", Vanil";
    }

    @Override
    public double cost() {
        switch (abstractCoffee.getSize()) {
            case SMALL -> {
                return abstractCoffee.cost() + 0.1;   // Сначала вызов cost() делегируется декорируемому объекту, а затем прибавляется стоимость добавки данного декоратора
            } case MEDIUM -> {
                return abstractCoffee.cost() + 0.15;
            } case LARGE -> {
                return abstractCoffee.cost() + 0.2;
            }
            default -> throw new IllegalStateException("Unexpected value: " + abstractCoffee.getSize());
        }
    }
}
