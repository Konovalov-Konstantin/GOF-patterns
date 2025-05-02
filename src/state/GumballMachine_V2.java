package state;

import state.states.HasQuarterState;
import state.states.NoQuarterState;
import state.states.SoldOutState;
import state.states.SoldState;

public class GumballMachine_V2 {

    /* Четыре СОСТОЯНИЯ заданы типом State */
    /**
     * в автомате нет жвачек
     */
    State soldOutState;
    /**
     * в автомате нет монеток
     */
    State noQuarterState;
    /**
     * в автомате есть монетки
     */
    State hasQuarterState;
    /**
     * жвачка была продана
     */
    State soldState;

    State state;   // текущее состояние
    int count = 0;          // количество шариков в автомате

    /* Все объекты State создаются и инициализируются в конструкторе */
    public GumballMachine_V2(int count) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        this.count = count;
        if (count > 0) {
            state = noQuarterState;
        } else {
            state = soldOutState;
        }
    }

    /* бросить монетку в автомат */
    public void insertQuarter() {
        state.insertQuarter();  // операция делегируется объекту текущего состояния
    }

    /* попытка вернуть монетку */
    public void ejectQuarter() {
        state.ejectQuarter();  // операция делегируется объекту текущего состояния
    }

    /* дернуть за рычаг */
    public void turnCrank() {
        state.turnCrank();  // операция делегируется объекту текущего состояния
        state.dispense();   // выдача шарика. Операция делегируется объекту текущего состояния

    }

    // уменьшает значение переменной count
    public void releaseBall() {
        System.out.println("Возьмите жвачку в слоте");
        if (count != 0) {
            count = count - 1;
        }
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    @Override
    public String toString() {
        String state;
        if (count > 0) {
            state = "-- Автомат в ожидании монеток";
        } else {
            state = "-- В автомате нет жвачек";
        }
        return "-- В автомате: " + count + " жвачек\n" + state;
    }
}
