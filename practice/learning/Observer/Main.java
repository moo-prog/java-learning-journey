package Observer;

public class Main {
    public static void main(String[] args) {

        YoutubeChannel channel = new YoutubeChannel("Moo Prog");

        Subscriber ali = new Subscriber("Ali");
        Subscriber ahmad = new Subscriber("Ahmad");

        channel.addSubscriber(ali);
        channel.addSubscriber(ahmad);

        channel.uploadVideo("Learn Git & GitHub in 10 Minutes!");
        channel.uploadVideo("Master Java Observer Pattern easily ");
    }
}