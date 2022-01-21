package brigde.filesupport;

import brigde.Program;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Class implements Program {

    @Override
    public void readFile(File file) {
        try {
            FileInputStream fis = new FileInputStream(file);
            int ch;
            while ((ch = fis.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
