package Command.Invokers;

import Command.Comandos.Command;

public abstract class Button {
    private Command command;

    public void setCommand(Command command) {
         this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }

}
