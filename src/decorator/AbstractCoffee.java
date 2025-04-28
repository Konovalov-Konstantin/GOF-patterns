package decorator;

public abstract class AbstractCoffee {    // суперкласс для оборачивания декораторами

    public enum Size {LARGE, MEDIUM, SMALL}

    Size size = Size.MEDIUM;

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return this.size;
    }

    public String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
