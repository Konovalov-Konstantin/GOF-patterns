package templateMethod;

public abstract class CaffeineBeverage {

    final void prepareRecipe() {            // шаблонный метод. Объявляется final, чтоб субклассы не могли изменить последовательность шагов в алгоритме.
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void brew();                   // должен быть реализован в субклассах
    abstract void addCondiments();          // должен быть реализован в субклассах

    void boilWater() {                      // может быть объявлен final, чтоб субклассы не смогли его переопределить
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
