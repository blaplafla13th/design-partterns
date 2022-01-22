package observer;

import java.util.ArrayList;

public abstract class User {
    protected ChatUpdater chatUpdater;
    protected ArrayList<String> listMessage=new ArrayList<>();
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
}
