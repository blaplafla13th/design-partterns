package decorator;

public class SuperUser extends ExtendUser{
    public SuperUser(User user) {
        super(user);
        resetActionList();
    }

    public void resetActionList(){
        listAction.clear();
        listAction.add("Super User action 1");
    }
    @Override
    public void action(String action) {
        for (String act:listAction) {
            if (act.equals(action)){
                System.out.println("Super user do "+action);
                return;
            }
        }
        System.out.println("Cant do this action");
    }
}
