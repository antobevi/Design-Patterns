package Command.Comandos;

import Command.Application;
import Command.Receiver.Editor;

public abstract class Command {
    protected Application app;
    protected Editor editor;
    private String backup;

    public Command(Application app, Editor editor) {
        this.app = app;
        this.editor = editor;
        this.backup = "";
    }

    public void saveBackup() {
        this.backup = editor.getSelection();
    }

    public void undo() {
        editor.replaceSelection(backup);
    }

    // El metodo devuelve true o false dependiendo de si cambia el estado del editor o no.
    public abstract Boolean execute();

}
