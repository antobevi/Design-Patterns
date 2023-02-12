package Command;

import Command.Comandos.*;
import Command.Invokers.CopyButton;
import Command.Invokers.CutButton;
import Command.Invokers.PasteButton;
import Command.Invokers.UndoButton;
import Command.Receiver.Editor;

import java.util.List;

/*
* Esta clase establece relaciones entre objetos. Actua como un EMISOR: cuando algo debe hacerse,
* crea un objeto de comando y lo ejecuta (y este comando llama al objeto Editor para que haga lo que debe).
*/
public class Application {
    private List<Editor> editors;
    private Editor activeEditor;
    private CommandHistory history;
    private String clipboard; // portapapeles

    // TODO: La inicializacion de BOTONES Y/O SHORTCUTS deberia hacerse en el MAIN.
    CopyButton copyButton = new CopyButton();
    PasteButton pasteButton = new PasteButton();
    CutButton cutButton = new CutButton();
    UndoButton undoButton = new UndoButton();

    public void setClipboard(String clipboard) {
        this.clipboard = clipboard;
    }

    public String getClipboard() {
        return clipboard;
    }

    // El codigo que asigna comandos a objetos UI puede tener el siguiente aspecto:
    public void createUI() {
        CopyCommand copy = new CopyCommand(this, activeEditor);
        copyButton.setCommand(copy);

        CutCommand cut = new CutCommand(this, activeEditor);
        cutButton.setCommand(cut);

        PasteCommand paste = new PasteCommand(this, activeEditor);
        pasteButton.setCommand(paste);

        UndoCommand undo = new UndoCommand(this, activeEditor);
        undoButton.setCommand(undo);
    }

    public void executeCommand(Command command) {

        if(command.execute()) {
            history.pushCommand(command);
        }

    }

    public void undoCommand() {
        // Toma el comando mas reciente del historial ejecuta su metodo deshacer.
        // Se le delega al comando deshacer su propia accion, Application no conoce la clase de este comando.
        Command command = history.popCommand();

        if(command != null) {
            command.undo();
        }
        
    }

}
