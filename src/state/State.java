package state;

public interface State {
    /** бросить монетку в автомат */
    void insertQuarter();
    /** попытка вернуть монетку */
    void ejectQuarter();
    /** дернуть за рычаг */
    void turnCrank();
    /** выдача шарика */
    void dispense();
    /** добавление жвачек в автомат */
    void refill();
}
