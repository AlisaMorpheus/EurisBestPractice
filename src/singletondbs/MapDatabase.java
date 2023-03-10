package singletondbs;

import java.util.HashMap;
import java.util.Map;

public class MapDatabase {
    //3 istanze pssql, postgresql e mysql --> Map<Int, String>
    //implementano una classe con operazioni CRUD(Create, read, update e delete)
    //su una mappa
    //Quando si inserisce un valore nella mappa, la chiave di inserimento è un
    //numero incrementale

    private final Map<Integer,String> database;

    private final Counter counter;

    public MapDatabase(Counter counter) {
        this.database = new HashMap<>();
        this.counter = counter;
    }

    public String insert(String value) {
        Integer key = counter.getCounter();
        this.database.put(key, value);
        return String.format("(%s, %s)", key, value);
    }

    public String read(Integer key){
        return database.get(key);
    }
    public String update(Integer key, String newValue){
        return database.replace(key, newValue);
    }
    public String delete(Integer key){
        return database.remove(key);
    }
}
