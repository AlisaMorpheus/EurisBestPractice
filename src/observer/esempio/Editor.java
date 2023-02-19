package observer.esempio;

import java.io.File;

public class Editor {
    public final EventManager eventManager;
    private File file;

    public Editor(EventManager eventManager){
        this.eventManager = eventManager;
    }

    public void openFile(String pathname) {
        try {
            this.file = new File(pathname);
            eventManager.notify("open", "File open");
        } catch (NullPointerException npe) {
            eventManager.notify("error", "something went wrong in opening the file");
        }
    }

    public void saveFile() {
        this.file = null; //Nun se faaa uguale a null
        eventManager.notify("remove", "file removed");
    }
}
