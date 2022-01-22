package decorator;

public class Client {
    public static void main(String[] args) {
        User user = new SimpleUser();
        user.setInfo("Blaplafla");
        user=new NormalUser(user);
        System.out.println(user.getInfo());
        user.readListAction();
        user=new SuperUser(user);
        System.out.println(user.getInfo());
        user.readListAction();
        user.setInfo("Hello World!");
        System.out.println(user.getInfo());
    }
}
