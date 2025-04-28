package adapter;

/* Прежде всего необходимо реализовать интерфейс того типа, на который рассчитан ваш клиент */
public class TurkeyAdapter implements Duck {

    Turkey turkey;

    /* Затем следует получить ссылку на адаптируемый объект; обычно это делается в конструкторе */
    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    /* Адаптер должен реализовать все методы интерфейса. Преобразование quack() между классами выполняется просто — реализация вызывает gobble().
    Чтоб Turkey мог реализовать интерфейс Duck - в метод Duck.quack() заворачивается вызов turkey.gobble() */
    @Override
    public void quack() {
        turkey.gobble();
    }

    /* Метод fly() входит в оба интефейса - поэтому просто оборачиваем turkey.fly() в Duck.fly() */
    @Override
    public void fly() {
        turkey.fly();
    }
}
