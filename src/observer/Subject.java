package observer;

public interface Subject {
    void registerObserver(Observer o);   // Регистрирует нового наблюдателя
    void removeObserver(Observer o);     // Удаляет наблюдателя
    void notifyObservers();              // Этот метод вызывается для оповещения наблюдателей об изменении состояния субъекта
    float getTemperature();
    float getHumidity();
    float getPressure();
}
