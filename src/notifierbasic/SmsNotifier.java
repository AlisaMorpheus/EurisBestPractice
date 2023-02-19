package notifierbasic;

public class SmsNotifier extends Notifier{
    @Override
    public void send(String message){
        System.out.println("Message sent from SmsNotifier: " + message);

    }
}
