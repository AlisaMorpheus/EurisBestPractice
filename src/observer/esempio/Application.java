package observer.esempio;

public class Application {
    public void run(){
        EventManager eventManager = new EventManager();
        Editor editor = new Editor(eventManager);

        Listener loggingListener = new LoggingListener();
        Listener emailListener = new EmailListener();

        eventManager.subscribe("open", emailListener);
        eventManager.subscribe("error", loggingListener);
        //gli forzo di non trovare il file
        String string = null;
        editor.openFile(string);
        //editor.openFile("/file");
        ((LoggingListener) loggingListener).showLog();
    }
}
