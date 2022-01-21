package adapter;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Normal Client:");
        Program program = new Program();
        System.out.println(program.command(-1));
        String something= input.nextLine();
        System.out.println(program.command(1));
        System.out.println(program.run(something));

        System.out.println("Client use adapter:");
        Language client = new Vietnamese(program);
        client.sendMessage(program.command(-1));
        something= input.nextLine();
        client.sendMessage(program.command(1));
        client.sendMessage(program.run(something));
    }
}
