package adapter;

public class Vietnamese implements Language {
    String[][] languagePack = {{"complete", "hoan tat"},
            {"fail","loi"},{"unknown","khong ro"},{"Write something","Nhap gi do"},
            {"Run program","chay chuong trinh"},
            {"Exit","Thoat"}};

    private Program program;

    public Vietnamese(Program program) {
        this.program = program;
    }

    public String translateMessage(String message) {
        String value = message;
        for (String[] strings : languagePack) {
            if (message.equals(strings[0])) {
                value = strings[1];
                break;
            }
        }
        return value;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(translateMessage(message));
    }
}
