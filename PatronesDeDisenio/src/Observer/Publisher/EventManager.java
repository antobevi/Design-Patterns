package Observer.Publisher;

import Observer.Subscribers.EventListeners;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// Publisher o Notificador base que incluye codigo de gestion de suscripciones y metodos de notificacion
public class EventManager { // Notificador base
    private HashMap<String, List<EventListeners>> listeners = new HashMap<>();

    public void subscribe(String eventType, EventListeners listener) {

        if(listeners.containsKey(eventType)) {
            listeners.get(eventType).add(listener);
        } else {
            listeners.put(eventType, new ArrayList<>());
            listeners.get(eventType).add(listener);
        }

    }

    public void unsubscribe(String eventType, EventListeners listener) {

        if(listeners.containsKey(eventType)) {
            listeners.remove(eventType, listener);
        } else {
            // TODO: Lanzar excepcion?
        }

    }

    public void notify(String eventType, String fileName) {
        listeners.get(eventType).forEach(listener -> listener.update(fileName));
    }

}
