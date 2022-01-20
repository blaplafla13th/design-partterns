package factory;

import factory.paymentmethod.*;

public class FactoryPaymentMethod {
    public PaymentMethod getMethod(String name){
        switch (name) {
            case "Techcombank": return new Techcombank();
            case "MoMo": return new MoMo();
            default:
                System.out.print("Khong ho tro phuong thuc thanh toan");
                return null;
        }
    }
}
