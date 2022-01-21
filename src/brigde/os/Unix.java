package brigde.os;

import brigde.Bridge;
import brigde.Program;

import java.io.File;
import java.io.IOException;

public class Unix extends Bridge {
    public Unix(Program program) {
        super('/',program);
    }

    @Override

    public void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    @Override
    public void readFile(File file) {
        program.readFile(file);
    }
}
