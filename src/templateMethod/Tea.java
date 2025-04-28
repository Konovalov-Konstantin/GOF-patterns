package templateMethod;

public class Tea extends CaffeineBeverage {

    // реализация методов boilWater и pourInCup наследуется из родительского класса

    // своя реализация
    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    // своя реализаци
    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
