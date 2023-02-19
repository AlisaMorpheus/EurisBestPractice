package observer.esempio;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class LoggingListener implements Listener{
    private Map<String, String> logFile;
    public LoggingListener(){
        this.logFile = new HashMap<>();
    }
    @Override
    public void update(String data) {
        logFile.put(LocalDate.now().toString(), data);
    }
    public void showLog(){
        System.out.printf("System logs are: \n");
        logFile.forEach((key,log) ->
                System.out.printf("\t[%s] - %s\n", key, log));
    }

}
