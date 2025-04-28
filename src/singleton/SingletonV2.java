package singleton;

public class SingletonV2 {

    /** Экземпляр Singleton создается заранее в статическом инициализаторе.Потоковая безопасность этого кода гарантирована! */
    private static SingletonV2 uniqueInstance = new SingletonV2();

    private SingletonV2() {}

    public static SingletonV2 getInstance() {
        return uniqueInstance;
    }

}
