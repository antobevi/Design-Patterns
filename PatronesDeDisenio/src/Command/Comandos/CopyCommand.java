package Command.Comandos;

import Command.Receiver.Editor;
import Command.Application;


public class CopyCommand extends Command {

    public CopyCommand(Application app, Editor editor) {
        super(app, editor);
    }

    public Boolean execute() {
        app.setClipboard(editor.getSelection());

        return false;
    }

}
