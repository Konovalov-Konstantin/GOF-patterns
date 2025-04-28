package templateMethod;

public class Coffee extends CaffeineBeverage {

    // реализация методов boilWater и pourInCup наследуется из родительского класса

    // своя реализация
    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    // своя реализация
    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}
