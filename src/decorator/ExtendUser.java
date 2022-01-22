package decorator;

import java.util.ArrayList;

public abstract class ExtendUser implements User {
    protected User user;

    public ExtendUser() {
        user = new SimpleUser();
    }

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

    public void readListAction() {
        user.readListAction();
    }

    @Override
    public void createAction(String action) {
        user.createAction(action);
    }

    @Override
    public void editAction(String beforeAction, String afterAction) {
        user.editAction(beforeAction, afterAction);
    }

    @Override
    public void deleteAction(String action) {
        user.deleteAction(action);
    }

    public ArrayList<String> getListAction() {
        return user.getListAction();
    }

    public void setListAction(ArrayList<String> listAction) {
        user.setListAction(listAction);
    }
}
