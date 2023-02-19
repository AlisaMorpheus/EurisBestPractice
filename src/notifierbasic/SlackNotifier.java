package notifierbasic;

public class SlackNotifier extends Notifier{
    @Override
    public void send(String message){
        System.out.println("Message sent from SlackNotifier: " + message);

    }
}
