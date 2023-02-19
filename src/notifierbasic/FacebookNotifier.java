package notifierbasic;

public class FacebookNotifier extends Notifier{
    @Override
    public void send(String message){
        System.out.println("Message sent from FacebookNotifier: " + message);

    }
}
