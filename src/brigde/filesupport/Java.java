package brigde.filesupport;

import brigde.Program;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Java implements Program {

    @Override
    public void readFile(File file) {
        try {
            Scanner readFile = new Scanner(file);
            while (readFile.hasNextLine()){
                System.out.println(readFile.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
