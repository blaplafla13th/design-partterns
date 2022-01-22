package decorator;

public interface User {
    String getInfo();
    void setInfo(String info);
    void action(String action);
    void removeAction(String action);
    void addAction(String action);
    void getListAction();
}
