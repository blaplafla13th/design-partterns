package adapter;

public class Program {
    public String status(int status) {
        return switch (status) {
            case 0 -> "complete";
            case 1 -> "fail";
            default -> "Unknown";
        };
    }

    public String command(int command) {
        return switch (command) {
            case -1 -> "Write something";
            case 1 -> "Run program";
            case 0 -> "Exit";
            default -> "Unknown";
        };
    }

    public String run(String sth) {
        try {
            Integer.parseInt(sth);
        } catch (NumberFormatException e) {
            return status(1);
        }
        return status(0);
    }
}
