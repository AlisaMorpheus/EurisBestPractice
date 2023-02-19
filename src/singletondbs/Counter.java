package singletondbs;

public class Counter {
    private static Counter instance;
    private int counter;

    private Counter() {
        this.counter = 1;
    }
    //met inizializza
    public static Counter getInstance(){
        if(instance==null){
            instance = new Counter();
        }
        return instance;
    }
    //op sul counter --> ogni volta che lo leggiamo
    // lo aumentiamo di 1 --> il counter si incrementa da solo
    public int getCounter(){
        return counter++;
    }
    //counter ++ e non ++counter perchè ++aggiorna prima
    //qui prendo prima val e poi operazione
}
