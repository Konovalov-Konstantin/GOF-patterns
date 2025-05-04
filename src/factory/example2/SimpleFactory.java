package factory.example2;

public class SimpleFactory {

    public static void main(String[] args) {
        Factory factory = new Factory();
        Car toyota = factory.createCar("Toyota");
        Car audi = factory.createCar("Audi");
        toyota.drive();
        audi.drive();
    }
}

/* Фабрика создает объектта Car в зависимости от переданного параметра typeOfCar */
class Factory {
    public Car createCar(String typeOfCar) {
        switch (typeOfCar) {
            case "Toyota":
                return new Toyota();
            case "Audi":
                return new Audi();
            default:
                return null;
        }
    }
}

interface Car {
    void drive();
}

class Toyota implements Car {
    @Override
    public void drive() {
        System.out.println("Toyota drive");
    }
}

class Audi implements Car {
    @Override
    public void drive() {
        System.out.println("Audi drive");
    }
}

