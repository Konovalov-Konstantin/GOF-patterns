package command;//package command;

import command.commands.Command;
import command.commands.NoCommand;

public class RemoteControl {      // пульт

    Command[] onCommands;       // ячейки на пульте для команд 'on'
    Command[] offCommands;      // ячейки на пульте для команд 'off'
    Command undoCommand;        // отмена последней команды
    private final int slots = 7;

    public RemoteControl() {
        onCommands = new Command[slots];
        offCommands = new Command[slots];

        Command noCommand = new NoCommand();    // чтоб не было NPE, если нажали незапрограммированную кнопку
        for (int i = 0; i < slots; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {    // Метод, вызываемый при нажати кнопки 'on'
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {    // Метод, вызываемый при нажати кнопки 'off'
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed() {     // кнопка отмены последнего нажатия кнопки
        undoCommand.undo();
    }
}
