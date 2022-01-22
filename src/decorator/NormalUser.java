package decorator;

public class NormalUser extends ExtendUser{
    public NormalUser() {
        super();
        resetActionList();
    }

    public NormalUser(User user) {
        super(user);
        resetActionList();
    }

    public NormalUser(User user, boolean reset) {
        super(user);
        if (reset)
            resetActionList();
    }

    public void resetActionList(){
        user.getListAction().clear();
        user.getListAction().add("Normal User action 1");
    }
    @Override
    public void action(String action) {
        for (String act:user.getListAction()) {
            if (act.equals(action)){
                System.out.println("Normal user do "+action);
                return;
            }
        }
        System.out.println("Cant do this action");
    }
}
