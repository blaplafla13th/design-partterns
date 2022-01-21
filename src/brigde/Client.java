package brigde;

import brigde.filesupport.Class;
import brigde.filesupport.Java;
import brigde.os.*;

import java.io.File;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Bridge bridge;
        final String OS = System.getProperty("os.name").toUpperCase();
        System.out.println(OS);
        if (OS.equals("WINDOWS")) {
            bridge = new Windows();
        } else {
            bridge = new Unix();
        }
        File current = new File("."+bridge.seperate);
        Scanner input = new Scanner(System.in);
        System.out.println(current.getAbsolutePath());
        System.out.println("Press anything to clear screen");
        input.nextLine();
        bridge.clear();
        Program readClass = new Class();
        File classFile =new File(current.getAbsolutePath()+bridge.seperate+"out"+
                bridge.seperate+"production"+bridge.seperate+"design-pattern"+bridge.seperate
        +"brigde"+bridge.seperate+"Client.class");
        System.out.println(classFile.getAbsolutePath());
        readClass.readFile(classFile);
        System.out.println("Press anything to clear screen");
        input.nextLine();
        bridge.clear();
        Program readJava = new Java();
        File javaFile =new File(current.getAbsolutePath()+bridge.seperate+"src"+
                bridge.seperate+"brigde"+bridge.seperate+"Client.java");
        System.out.println(javaFile.getAbsolutePath());
        readClass.readFile(javaFile);
    }
}
