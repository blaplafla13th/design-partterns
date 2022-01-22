package decorator;

import java.util.ArrayList;

public interface User {
    String getInfo();
    void setInfo(String info);

    ArrayList<String> getListAction();
    void setListAction(ArrayList<String> listAction);

    void action(String action);
    void deleteAction(String action);
    void createAction(String action);
    void editAction(String beforeAction,String afterAction);
    void readListAction();

}
