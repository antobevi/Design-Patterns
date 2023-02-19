package Observer.Publisher;

import Observer.Publisher.EventManager;

import java.io.File;

// El notificador concreto contiene logica de negocio real, de interes para algunos suscriptores. Podemos
// derivar esta clase de la notificadora base, pero esto no siempre es posible en el mundo real porque puede
// que la notificadora concreta sea ya una subclase. En este caso, se puede modificar la logica de la suscripcion
// con composicion, como en este caso.
public class Editor { // Notificador concreto
    private EventManager events;
    private File file;

    public Editor() {
        events = new EventManager();
    }

    public EventManager getEvents() {
        return events;
    }

    // Los metodos de la logica de negocio pueden notificar los cambios a los suscriptores
    public void openFile(String path) {
        this.file = new File(path);
        events.notify("Open", file.getName());
    }

    public void saveFile() {
        //file.write();
        events.notify("Save", file.getName());
    }

    // Otra logica de negocio

}
