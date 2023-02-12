package Command.Comandos;

import Command.Receiver.Editor;
import Command.Application;

public class CutCommand extends Command {

    public CutCommand(Application app, Editor editor) {
        super(app, editor);
    }

    public Boolean execute() {
        // El comando cortar no cambia el estado del editor, por lo que deb guardarse en el historial.
        // Y se guardara siempre y cuando el metodo devuelva verdadero.
        saveBackup();
        app.setClipboard(editor.getSelection());

        return true;
    }

}
