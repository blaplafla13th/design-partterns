package brigde.os;

import brigde.Bridge;

import java.io.IOException;

public class Unix extends Bridge {
    public Unix() {
        super('/');
    }

    @Override

    public void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
