package decorator;

import java.util.ArrayList;

public class SimpleUser implements User {
    private String info;
    private ArrayList<String> listAction=new ArrayList<>();

    @Override
    public String getInfo() {
        return info;
    }

    @Override
    public void action(String action) {
        for (String act:listAction) {
            if (act.equals(action)){
                System.out.println("Simple user do "+action);
                return;
            }
        }
        System.out.println("Cant do this action");
    }

    @Override
    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public void readListAction() {
        for (String action : listAction) {
            System.out.println(action);
        }
    }

    @Override
    public void createAction(String action) {
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
    public void deleteAction(String action) {
        for (int i = 0; i < listAction.size(); i++) {
            if (listAction.get(i).equals(action)){
                listAction.remove(i);
                System.out.println("Deleted");
                return;
            }
        }
    }
}
