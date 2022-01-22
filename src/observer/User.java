package observer;

import java.util.ArrayList;

public class User {
    protected ChatUpdater chatUpdater;
    protected ArrayList<String> listMessage=new ArrayList<>();

    public User(ChatUpdater chatUpdater) {
        this.chatUpdater =chatUpdater;
        this.chatUpdater.add(this);
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
        chatUpdater.addChat(this.getClass().getName()+":"+info);
    }
    public void getLatestChat(){
        System.out.println(listMessage.get(listMessage.size()-1));
    }
}
