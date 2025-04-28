package singleton;

public class SingletonV3 {

    private volatile static SingletonV3 uniqueInstance;     // volatile для корректности работы нескольких потоков с одной переменной

    private SingletonV3() {
    }

    public static SingletonV3 getInstance() {
        if (uniqueInstance == null) {
            synchronized (SingletonV3.class) {          // синхронизация будет выполняться только при первом вызове
                if (uniqueInstance == null) {           // Внутри блока повторяем проверку, и если значение все еще равно null, создаем экземпляр
                    uniqueInstance = new SingletonV3();
                }
            }
        }
        return uniqueInstance;
    }
}
