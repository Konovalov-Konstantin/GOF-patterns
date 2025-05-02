package state.states;

import state.GumballMachine_V2;
import state.State;

public class HasQuarterState implements State {

    GumballMachine_V2 gumballMachine;

    public HasQuarterState(GumballMachine_V2 gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("В автомате уже есть монетка, вы не можете положить вторую");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Возьмите обратно вашу монетку");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("Вы дернули за рычаг...");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("Жевательная резинка не выдается");
    }
}
