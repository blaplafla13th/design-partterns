package decorator;

public interface User {
    String getInfo();
    void setInfo(String info);
    void action(String action);
    void deleteAction(String action);
    void createAction(String action);
    void editAction(String beforeAction,String afterAction);
    void readListAction();
}
