package singletondbs;

public class Main {
    public static void main(String[] args) {

        MapDatabase pssql = new MapDatabase(Counter.getInstance());
        MapDatabase postgresql = new MapDatabase(Counter.getInstance());
        MapDatabase mysql = new MapDatabase(Counter.getInstance());

        System.out.println(pssql.insert("ciao"));
        System.out.println(postgresql.insert("due"));
        System.out.println(pssql.insert("Hello"));
        System.out.println(mysql.insert("Prova"));

    }
}
