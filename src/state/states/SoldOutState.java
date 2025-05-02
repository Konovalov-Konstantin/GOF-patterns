package state.states;

import state.GumballMachine_V2;
import state.State;

public class SoldOutState implements State {

    GumballMachine_V2 gumballMachine;

    public SoldOutState(GumballMachine_V2 gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Извините, все жвачки распроданы");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Жвачка кончилась, возврат невозможен — автомат не принимает монетки");
    }

    @Override
    public void turnCrank() {
        System.out.println("Выдача невозможна — в автомате нет жвачки");
    }

    @Override
    public void dispense() {
        System.out.println("Жвачка закончилась");
    }
}
