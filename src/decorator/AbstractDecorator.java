package decorator;

public abstract class AbstractDecorator extends AbstractCoffee {  // абстрактный декоратор. От него наследуются конкретные декораторы.

    public AbstractCoffee abstractCoffee;      // Объект AbstractCoffee, который будет «заворачиваться» в Decorator

    public abstract String getDescription();

}
