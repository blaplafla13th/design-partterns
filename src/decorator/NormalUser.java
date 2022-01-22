package decorator;

public class NormalUser extends ExtendUser{
    public NormalUser(User user) {
        super(user);
        resetActionList();
    }

    public void resetActionList(){
        listAction.clear();
        listAction.add("Normal User action 1");
    }
    @Override
    public void action(String action) {
        for (String act:listAction) {
            if (act.equals(action)){
                System.out.println("Normal user do "+action);
                return;
            }
        }
        System.out.println("Cant do this action");
    }
}
