package Observer.Subscribers;

import java.io.File;

public class LoggingListener implements EventListeners {
    private File log;
    private String message;

    public LoggingListener(String log_filename, String message) {
        this.log = new File(log_filename);
        this.message = message;
    }

    public void update(String fileName) {
        //log.write(replace("%s", fileName, message));
    }

}
