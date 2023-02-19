package decoratornotifier;

public abstract class NotifierDecorator extends Notifier {
    private final Notifier notifier;

    public NotifierDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void send(String message) {
        notifier.send(message);
        extra(message);
    }
//extra: comportamento che vogliamo in più
    public abstract void extra(String message);

}
