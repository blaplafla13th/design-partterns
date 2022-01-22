package decorator;

public class Client {
    public static void main(String[] args) {
        User user = new SimpleUser();
        user.setInfo("Blaplafla");
        System.out.println(user.getInfo());
        user.createAction("A");
        user.action("A");
        user=new NormalUser(user,false);
        // reset = false so dont do resetActionList
        System.out.println(user.getInfo());
        user.readListAction();
        user.action("A");
        user=new SuperUser(user);
        System.out.println(user.getInfo());
        user.readListAction();
        user.setInfo("Hello World!");
        user.action("A");
        System.out.println(user.getInfo());
        User user1 = new SuperUser();
        System.out.println(user1.getListAction());
    }
}
