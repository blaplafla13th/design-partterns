package adapter;

public interface Language {
    String command(int command);
    String status(int status);
    String run(String sth);
}
