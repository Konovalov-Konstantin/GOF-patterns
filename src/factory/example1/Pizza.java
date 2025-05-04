package factory.example1;

public abstract class Pizza {

    protected String name;
    protected String sauce;

    void prepare() {
        System.out.println("Подготовка к выпечке пиццы " + name);
    }
    void bake() {
        System.out.println("Запекание пиццы " + name);
    }
    protected void cut() {
        System.out.println("Нарезка пиццы " + name);
    }
    void box() {
        System.out.println("Упаковка пиццы " + name);
    }

    public String getName() {
        return name;
    }
}
