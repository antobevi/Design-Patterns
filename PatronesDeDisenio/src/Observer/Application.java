package Observer;

import Observer.Publisher.Editor;
import Observer.Subscribers.EmailAlertsListener;
import Observer.Subscribers.LoggingListener;

// Una aplicacion puede configurar notificadores y suscriptores durante el tiempo de ejecucion
public class Application {
    private Editor editor;
    private LoggingListener logger;
    private EmailAlertsListener emailAlerts;

    public void config() {
        this.editor = new Editor();
        this.logger = new LoggingListener("/path/yo/log.txt",
                "Someone has opened the file: %s");
        this.emailAlerts = new EmailAlertsListener("admin@example.com",
                "Someone has changed the file: %s");

        editor.getEvents().subscribe("Open", logger);
        editor.getEvents().subscribe("Save", emailAlerts);
    }

}
