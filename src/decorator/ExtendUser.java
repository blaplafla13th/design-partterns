package decorator;

import java.util.ArrayList;

public abstract class ExtendUser implements User {
    private User user;
    protected ArrayList<String> listAction=new ArrayList<>();

    public ExtendUser(User user) {
        this.user = user;
    }

    @Override
    public String getInfo() {
        return user.getInfo();
    }

    @Override
    public abstract void action(String act);
    public abstract void resetActionList();

    @Override
    public void setInfo(String info) {
        user.setInfo(info);
    }

    public void getListAction() {
        for (String action : listAction) {
            System.out.println(action);
        }
    }

    @Override
    public void addAction(String action) {
        listAction.add(action);
    }

    @Override
    public void editAction(String beforeAction, String afterAction) {
        for (int i = 0; i < listAction.size(); i++) {
            if (listAction.get(i).equals(beforeAction)){
                listAction.set(i,afterAction);
            }
        }
    }

    @Override
    public void removeAction(String action) {
        for (int i = 0; i < listAction.size(); i++) {
            if (listAction.get(i).equals(action)){
                listAction.remove(i);
                System.out.println("Deleted");
                return;
            }
        }
    }
}
