package brigde.os;

import brigde.Bridge;
import brigde.Program;

import java.io.File;
import java.io.IOException;

public class Windows extends Bridge {
    public Windows(Program program) {
        super('\\', program);
    }

    @Override
    public void clear() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }
    public void readFile(File file){
        program.readFile(file);
    }
}
