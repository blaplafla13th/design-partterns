package command;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        File file = new File(".");
        Command viewFolder=new ViewFolder(file);
        Command viewFile=new ViewFolder(file);
        Command fileInfo=new FileInfo(file);
        Program program = new Program(viewFile,fileInfo,viewFolder,file);


        while (true) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("Path: " + program.getPath());
            System.out.print("""
                    1.Change directory
                    2.Select in this directory
                    3.View
                    4.Get Info
                    5.Exit""");
            System.out.println();
            System.out.print("Input Option:");
            int opt = Integer.parseInt(input.nextLine());
            System.out.print("\033[H\033[2J");
            System.out.flush();
            switch (opt) {
                case 1 -> funct1(program, input);
                case 2 -> funct2(program, input);
                case 3 -> {
                    program.view();
                    pause();
                }
                case 4 -> {
                    program.getInfo();
                    pause();
                }
                case 5 -> System.exit(0);
                default -> {
                }
            }
        }
    }

    public static void funct1(Program program, Scanner input) {
        System.out.print("Input path:");
        program.changeDirectory(input.nextLine());
    }

    public static void funct2(Program program, Scanner input) {
        String[] list = program.listIn();
        if (list == null) {
            System.out.println("Not found");
        } else {
            System.out.println("0.exit");
            for (int i = 0; i < list.length; i++) {
                System.out.println((i + 1) + ". " + list[i]);
            }
            int opt = -2;
            while (opt < 0 || opt > list.length) {
                System.out.print("Input Option:");
                opt = Integer.parseInt(input.nextLine());
            }
            if (opt - 1 != -1) {
                program.select(list[opt - 1]);
            }
        }
    }
    public static void pause(){
        System.out.println("Press enter to continue...");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
