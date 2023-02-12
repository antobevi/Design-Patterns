package Command.Comandos;

import java.util.List;

public class CommandHistory { // Es como una pila
    private List<Command> commands;

    public void pushCommand(Command command) {
        commands.add(command);
    }

    public Command popCommand() {
        return commands.remove((commands.size())-1);
    }

}
