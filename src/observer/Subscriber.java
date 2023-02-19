package observer;

import java.util.ArrayList;
import java.util.List;

public class Subscriber {
    private List<String> messages;
    public Subscriber(){
        this.messages = new ArrayList<>();
    }
    public void update(String message){
        //System.out.println(message);
        messages.add(message);
    }
    public void  showAllMessages(){
        messages.forEach(System.out::println);
    }
}
