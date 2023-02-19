package observer;

import java.util.ArrayList;
import java.util.List;
public class Publisher {
    private List<Subscriber> subscriberList;
    public Publisher(){
        this.subscriberList = new ArrayList<>();
    }
    public void subscribe(Subscriber subscriber){
        subscriberList.add(subscriber);
    }
    public void unsubscribe(Subscriber subscriber){
        subscriberList.remove(subscriber);
    }
    public void notifySubscriber(String message){
        subscriberList.forEach(subscriber -> subscriber.update(message));
    }
}
