package state.states;

import state.GumballMachine_V2;
import state.State;

public class NoQuarterState implements State {

    GumballMachine_V2 gumballMachine;

    public NoQuarterState(GumballMachine_V2 gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Вы положили монетку");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("В автомате нет монеток, нечего возвращть");
    }

    @Override
    public void turnCrank() {
        System.out.println("Чтоб получить жвачку, сначала нужно бросить монетку");
    }

    @Override
    public void dispense() {
        System.out.println("Сначала положите монетку");
    }

    @Override
    public void refill() {
    }
}
