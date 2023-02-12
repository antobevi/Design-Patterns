package Command.Comandos;

import Command.Receiver.Editor;
import Command.Application;

public class UndoCommand extends Command {

    public UndoCommand(Application app, Editor editor) {
        super(app, editor);
    }

    public Boolean execute() {
        app.undoCommand();

        return false;
    }

}
