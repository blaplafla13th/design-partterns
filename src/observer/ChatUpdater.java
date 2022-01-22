package observer;

import java.util.ArrayList;

public class ChatUpdater {
    private ArrayList<User> users = new ArrayList<>();
    private String message;

    public void add(User user) {
        users.add(user);
        addChat("Server: Hello "+user.getClass().getName());
    }

    public String getChat() {
        return message;
    }

    public void addChat(String info) {
        this.message = info;
        execute();
    }

    private void execute() {
        for (User user : users) {
            user.update();
        }
    }
}
