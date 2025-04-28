package adapter;

public class Main {
    public static void main(String[] args) {

        Turkey turkey = new WildTurkey();

        Duck adaptedTurkey = new TurkeyAdapter(turkey);   // Turkey упаковывается в TurkeyAdapter и начинает выглядеть как Duck

        adaptedTurkey.quack();  // вызов метода quack(которого нет в интерфейсе Turkey) у объекта turkey через адаптер
        adaptedTurkey.fly();    // вызов обернутого turkey.fly() из адаптера
    }
}
