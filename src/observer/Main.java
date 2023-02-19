package observer;

public class Main {
    public static void main(String[] args) {

        Publisher publisher = new Publisher();
        Subscriber luca = new Subscriber();

        publisher.subscribe(luca);
        publisher.notifySubscriber("Iphone disponibile");

        luca.showAllMessages();

        publisher.unsubscribe(luca);

        publisher.notifySubscriber("Ipad disponibile");
        luca.showAllMessages();
    }
}
