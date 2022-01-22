package observer;

import java.util.ArrayList;

public class User {
    private String userName;
    private ChatUpdater chatUpdater;
    private ArrayList<String> listMessage=new ArrayList<>();

    public User(String userName, ChatUpdater chatUpdater) {
        this.chatUpdater=chatUpdater;
        this.userName=userName;
        this.chatUpdater.add(this);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void update() {
        listMessage.add(chatUpdater.getChat());
    }
    public void getAllChat(){
        for (String mess: listMessage) {
            System.out.println(mess);
        }
    }
    public void addChat(String info){
        chatUpdater.addChat(userName+":"+info);
    }
    public void getLatestChat(){
        System.out.println(listMessage.get(listMessage.size()-1));
    }
}
