package builder;

import java.util.ArrayList;
import java.util.Scanner;

public class Client {
    private static ArrayList<Account> accountArrayList = new ArrayList<>();

    public static ArrayList<Account> getAccountArrayList() {
        return accountArrayList;
    }

    public static void main(String[] args) {
        Account current = null;
        AccountDirector director = null;
        while (true) {
            System.out.printf("1.Sign in\n2.Sign up\n0.Exit\n");
            Scanner input = new Scanner(System.in);
            int opt = Integer.parseInt(input.nextLine());
            if (opt == 1) {
                director = new AccountDirector(new SignInBuilder());
            }
            if (opt == 2) {
                director = new AccountDirector(new SignUpBuilder());
            }
            if (opt == 0) System.exit(0);
            director.sign();
            try {
                current = director.getAccount();
                System.out.println("builder.Account info:");
                System.out.println(current.toString());
                System.out.println("Edit name test:");
                String name = input.nextLine();
                current.setName(name);
                for (int i = 0; i < accountArrayList.size(); i++) {
                    if (current.getUserName().equals(accountArrayList.get(i).getUserName())) {
                        accountArrayList.set(i, current);
                    }
                }
                System.out.println("Sign out test. Press enter to continue.");
                input.nextLine();
            } catch (Exception e) {
            }
        }
    }
}
