package stragety;

import stragety.paymentmethod.PaymentMethod;

import java.io.File;
import java.io.FileFilter;
import java.util.Scanner;

public class Client {
    public static void main(String[] args){
        File methodPath = new File("src"+File.separator+"stragety"+File.separator+"paymentmethod");
        FileFilter methodFilter = file -> !file.getName().equals("PaymentMethod.java");
        File[] listMethod = methodPath.listFiles(methodFilter);
        if (listMethod == null){
            System.out.println("Khong tim thay phuong thuc thanh toan");
            System.exit(0);
        }
        System.out.println("Cac phuong thuc thanh toan ho tro:");
        for (File paymentMethod:listMethod) {
            System.out.println(paymentMethod.getName().replace(".java", ""));
        }
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap ten phuong thuc:");
        StragetyPaymentMethod paymentMethod = new StragetyPaymentMethod(input.nextLine());
        System.out.println("Ten phuong thuc thanh toan: "+paymentMethod.getMethodName());
        System.out.println("So tai khoan: "+paymentMethod.getAccountNumber());
        System.out.println("Ten tai khoan: "+paymentMethod.getAccountName());
        System.out.print("Nhap thong tin thanh toan:");
        String account = input.nextLine();
        paymentMethod.pay(account);
    }
}
