package builder;

import java.util.ArrayList;
import java.util.Scanner;

public class SignUpBuilder implements AccountBuilder {
    private static Scanner input = new Scanner(System.in);
    private Account account;
    private ArrayList<Account> accounts = Client.getAccountArrayList();

    public SignUpBuilder() {
        this.account = new Account();
    }


    @Override
    public void step1() {
        System.out.print("Username:");
        String userName = input.nextLine();
        System.out.print("Password:");
        String password = input.nextLine();
        password = account.hashPassword(password);
        account.setUserName(userName);
        account.setPassword(password);
        System.out.print("Name:");
        String name = input.nextLine();
        System.out.print("Email:");
        String email = input.nextLine();
        account.setName(name);
        if (account.checkEmail(email))
            account.setEmail(email);
    }

    @Override
    public void step2() {
        for (int i = 0; i < accounts.size(); i++) {
            if (account.getUserName().equals(accounts.get(i).getUserName())) {
                System.out.println("Tai khoan da duoc tao");
                return;
            }
        }
        Client.getAccountArrayList().add(account);
    }

    @Override
    public Account getAccount() {
        return account;
    }
}
