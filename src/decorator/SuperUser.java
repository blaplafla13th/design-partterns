package decorator;

public class SuperUser extends ExtendUser{
    public SuperUser(User user) {
        super(user);
        resetActionList();
    }

    public SuperUser() {
        super();
        resetActionList();
    }

    public SuperUser(User user, boolean reset) {
        super(user);
        if (reset)
            resetActionList();
    }

    public void resetActionList(){
        user.getListAction().clear();
        user.getListAction().add("Super User action 1");
    }
    @Override
    public void action(String action) {
        for (String act:user.getListAction()) {
            if (act.equals(action)){
                System.out.println("Super user do "+action);
                return;
            }
        }
        System.out.println("Cant do this action");
    }
}
