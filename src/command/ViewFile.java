package command;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ViewFile implements Command{
    private File file;

    public ViewFile(File file) {
        this.file = file;
    }

    @Override
    public void exec() {
        try {
            Scanner input = new Scanner(file);
            while (input.hasNextLine())
                System.out.println(input.nextLine());
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
