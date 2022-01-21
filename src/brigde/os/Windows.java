package brigde.os;

import brigde.Bridge;

import java.io.IOException;

public class Windows extends Bridge {
    public Windows() {
        super('\\');
    }

    @Override
    public void clear() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }
}
