package observer.esempio;

public class EmailListener implements Listener{

    @Override
    public void update(String data) {
        System.out.printf("email sent with data: ", data);
    }
}
