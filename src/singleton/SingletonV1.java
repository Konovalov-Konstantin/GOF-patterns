package singleton;

public class SingletonV1 {

    private static SingletonV1 uniqueInstance;    // Статическая переменная для хранения единственного экземпляра

    private SingletonV1() {}      // Приватный конструктор. Только Singleton может создавать экземпляры этого класса

    /** Синхонизация метода может замедлить его выполнение. Если метод getInstance() применяется в интенсивно используемой
     части приложения - следует рассмотреть пример SingletonV2 или SingletonV3  */
    public static synchronized SingletonV1 getInstance() {    // synchronized - решение проблемы многопоточного доступа
        if (uniqueInstance == null) {           // Если uniqueInstance содержит null, значит, экземпляр еще не создан, иначе возвращаем ранее созданный объект
            uniqueInstance = new SingletonV1();
        }
        return uniqueInstance;
    }
}
