package observer.esempio;

import java.util.HashMap;
import java.util.Map;

public class EventManager {
    private final Map<String, Listener> listeners;
    public EventManager(){
        this.listeners = new HashMap<>();
    }
    public void subscribe(String eventType, Listener listener){
        this.listeners.put(eventType, listener); //aggiungiamo sottoscrizione
    }
    public void unsubscribe(String eventType, Listener listener){
        this.listeners.remove(eventType); //rimuovo sottoscrizione
    }
    public void notify(String eventType, String data){
        listeners.forEach((key, listener) -> {
            if (key.equals(eventType)) listener.update(data);
        });
    }
}
