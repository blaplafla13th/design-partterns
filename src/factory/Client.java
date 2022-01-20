package factory;

import factory.paymentmethod.PaymentMethod;

import java.io.File;
import java.io.FileFilter;
import java.util.Scanner;

public class Client {
    public static void main(String[] args){
        File methodPath = new File("src"+File.separator+"factory"+File.separator+"paymentmethod");
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
        FactoryPaymentMethod factoryPaymentMethod = new FactoryPaymentMethod();
        PaymentMethod paymentMethod = factoryPaymentMethod.getMethod(input.nextLine());
        System.out.println("Ten phuong thuc thanh toan: "+paymentMethod.getMethodName());
        System.out.println("So tai khoan: "+paymentMethod.getAccountNumber());
        System.out.println("Ten tai khoan: "+paymentMethod.getAccountName());
        System.out.print("Nhap thong tin thanh toan:");
        String account = input.nextLine();
        paymentMethod.pay(account);
    }
}
