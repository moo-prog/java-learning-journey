package Observer;

public class Subscriber implements Observer {
    private String userName;

    public Subscriber(String name) {
        this.userName = name;
    }

    @Override
    public void update(String videoTitle) {
        // Print the notification message whenever the channel updates
        System.out.println(" Notification for " + userName + ": New video uploaded: " + videoTitle);
    }
}