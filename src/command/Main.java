package command;

import command.devices.GarageDoor;
import command.devices.Light;
import command.devices.Stereo;
import command.commands.*;

public class Main {
    public static void main(String[] args) {
        /* Пульт */
        RemoteControl remoteControl = new RemoteControl();

        /* Управляемые пультом объекты */
        Light livingRoomLight = new Light();
        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo = new Stereo();

        LightOnCommand lightOnCommand = new LightOnCommand(livingRoomLight);           // Создание команды 'on' с указанием получателя (управляемого объекта - свет)
        LightOffCommand lightOffCommand = new LightOffCommand(livingRoomLight);        // Создание команды 'off'
        remoteControl.setCommand(1, lightOnCommand, lightOffCommand);             // назначение команд 'on' и 'off' на 1 слот пульта

        GarageDoorOpenCommand doorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand dDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);
        remoteControl.setCommand(2, doorOpenCommand, dDoorCloseCommand);      // назначение команд на 2 слот пульта

        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        remoteControl.setCommand(3, stereoOnWithCDCommand, stereoOnWithCDCommand);      // назначение команды на 3 кнопку пульта

        remoteControl.onButtonWasPushed(1);                             // нажатие кнопки 'on' на 1 слоте пульта (вкл свет)
        remoteControl.offButtonWasPushed(2);                            // нажатие кнопки 'off' на 2 слоте пульта (закрыть ворота)
        remoteControl.undoButtonWasPushed();                                 // отмена нажатия последней (второй)кнопки (открыть ворота)
        remoteControl.onButtonWasPushed(3);                             // нажатие кнопки 'on' на 3 слоте пульта (вкл музыку)
        remoteControl.onButtonWasPushed(4);                             // пустая кнопка
    }
}
