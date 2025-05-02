package state.states;

import state.GumballMachine_V2;
import state.State;

public class SoldState implements State {

    GumballMachine_V2 gumballMachine;

    public SoldState(GumballMachine_V2 gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Подождите, мы выдаем вашу жвачку");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Жвачка уже куплена, возврат невозможен");
    }

    @Override
    public void turnCrank() {
        System.out.println("Вы уже получили вашу жвачку, чтоб получить еще одну - положите монетку!");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            System.out.println("Жвачка закончилась");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }

    @Override
    public void refill() {
    }
}
