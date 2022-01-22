package observer;

public class User1 extends User {
    public User1(ChatUpdater chatUpdater) {
        this.chatUpdater =chatUpdater;
        this.chatUpdater.add(this);
    }
}
