package Command.Receiver;

/*
* La clase Editor tiene operaciones reales de edición de texto.
* Juega el papel de un RECEPTOR:
* Todos los comandos acaban delegando la ejecución a los métodos del editor.
* Es decir, los commandos en su método execute() en realidad llamar a la clase Editor.
*/
public class Editor {
    private String text;

    public String getSelection() {
        // Devuelve el texto seleccionado
        return text;
    }

    public void deleteSelection() {
        // Borra el texto seleccionado
        text = " ";
    }

    public void replaceSelection(String text) {
        // Inserta los contenidos del portapapeles en la posicion actual
        this.text = text;
    }

}
