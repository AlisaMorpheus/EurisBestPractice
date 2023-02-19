package notifierbasic;

public class Main {
    public static void main(String[] args) {

        Application application  = new Application(NotifierFactory.getInstance());
        application.setNotifier(NotifierEnum.SLACK);
        application.doSomething("Alert!");
    }
}
