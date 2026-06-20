package Observer;
import java.util.ArrayList;
import java.util.List;
public class YoutubeChannel {
    private List<Observer> subscribers = new ArrayList<>(); //  List to store subscribers (observers) who activated the bell
    private String channelName;

    public YoutubeChannel(String name) {
        this.channelName = name;
    }
    public void addSubscriber(Observer observer) {    // Method to register/add a new subscriber to the list

        subscribers.add(observer);
    }

    public void uploadVideo(String title) {    // Method simulating a new video being uploaded to the channel

        System.out.println("\n Channel " + channelName + ",uploaded a new video: " + title);

        notifySubscribers(title);        // Notify all subscribers immediately after the upload

    }

    private void notifySubscribers(String videoTitle) {
        for (Observer subscriber : subscribers) {
            subscriber.update(videoTitle);
        }
    }
}