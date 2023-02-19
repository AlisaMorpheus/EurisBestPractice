package notifierbasic;

public class Application {
    private final NotifierFactory notifierFactory;
    private Notifier notifier;

    public Application(NotifierFactory notifierFactory) {
        this.notifierFactory = notifierFactory;
    }
    public void setNotifier(NotifierEnum notifierEnum){
        this.notifier = notifierFactory.build(notifierEnum);
    }
    public void doSomething(String message){
        this.notifier.send(message);
    }
}
