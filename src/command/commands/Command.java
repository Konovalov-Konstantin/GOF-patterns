package command.commands;

public interface Command {
    void execute();     // нажатие кнопки
    void undo();        // отмена последней команды
}
