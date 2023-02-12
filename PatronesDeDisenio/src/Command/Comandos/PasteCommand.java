package Command.Comandos;

import Command.Receiver.Editor;
import Command.Application;

public class PasteCommand extends Command {

    public PasteCommand(Application app, Editor editor) {
        super(app, editor);
    }

    public Boolean execute() {
        saveBackup();
        editor.replaceSelection(app.getClipboard());

        return true;
    }

}
