package brigde;

import brigde.filesupport.Class;
import brigde.filesupport.Java;
import brigde.os.*;

import java.io.File;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Bridge bridgeJava;
        Bridge bridgeClass;
        final String OS = System.getProperty("os.name").toUpperCase();
        System.out.println(OS);
        if (OS.equals("WINDOWS")) {
            bridgeJava = new Windows(new Java());
            bridgeClass = new Windows(new Class());
        } else{
            bridgeJava = new Unix(new Java());
            bridgeClass = new Unix(new Class());
        }
        File current = new File("."+bridgeClass.SEPARATE);
        Scanner input = new Scanner(System.in);
        System.out.println(current.getAbsolutePath());
        System.out.println("Press anything to clear screen");
        input.nextLine();
        bridgeClass.clear();
        File classFile =new File(current.getAbsolutePath()+bridgeClass.SEPARATE +"out"+
                bridgeClass.SEPARATE +"production"+bridgeClass.SEPARATE +"design-pattern"
                +bridgeClass.SEPARATE +"brigde"+bridgeClass.SEPARATE +"Client.class");
        System.out.println(classFile.getAbsolutePath());
        bridgeClass.readFile(classFile);
        System.out.println("Press anything to clear screen");
        input.nextLine();
        bridgeJava.clear();
        File javaFile =new File(current.getAbsolutePath()+bridgeJava.SEPARATE +"src"+
                bridgeJava.SEPARATE +"brigde"+bridgeJava.SEPARATE +"Client.java");
        System.out.println(javaFile.getAbsolutePath());
        bridgeJava.readFile(javaFile);
    }
}
