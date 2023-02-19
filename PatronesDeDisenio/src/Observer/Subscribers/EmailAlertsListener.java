package Observer.Subscribers;

public class EmailAlertsListener implements EventListeners {
    private String email;
    private String message;

    public EmailAlertsListener(String email, String message) {
        this.email = email;
        this.message = message;
    }

    public void update(String fileName) {
        //sendEmail(email, replace("%s", fileName, message));
    }

}
