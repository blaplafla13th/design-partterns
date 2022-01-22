package observer;

public class User2 extends User {
    public User2(ChatUpdater chatUpdater) {
        this.chatUpdater = chatUpdater;
        this.chatUpdater.add(this);
    }
}
