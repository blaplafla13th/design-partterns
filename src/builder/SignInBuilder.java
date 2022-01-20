package builder;

import java.util.ArrayList;
import java.util.Scanner;

public class SignInBuilder implements AccountBuilder {
    private static Scanner input = new Scanner(System.in);
    private Account account;
    private int status=-1;
    private ArrayList<Account> accounts = Client.getAccountArrayList();
    public SignInBuilder() {
        this.account = new Account();
    }


    @Override
    public void step1() {
        System.out.print("Username:");
        String userName = input.nextLine();
        System.out.print("Password:");
        String password = input.nextLine();

        for (int i = 0; i < accounts.size(); i++) {
            if (userName.equals(accounts.get(i).getUserName())) {
                if(accounts.get(i).checkPassword(password)){
                    status=i;
                }
            }
        }
    }

    @Override
    public void step2() {
        if (status==-1){
            System.out.println("Khong ton tai tai khoan");
            account=null;
        }
        else
            account=accounts.get(status);
    }

    @Override
    public Account getAccount() {
        return account;
    }
}
