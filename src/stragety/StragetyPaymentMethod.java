package stragety;

import stragety.paymentmethod.*;

public class StragetyPaymentMethod {
    PaymentMethod paymentMethod;

    public StragetyPaymentMethod(String name) {
        switch (name) {
            case "Techcombank":
                paymentMethod = new Techcombank();
            case "MoMo":
                paymentMethod = new MoMo();
            default:
                System.out.print("Khong ho tro phuong thuc thanh toan");
                paymentMethod = null;
        }
    }

    String getMethodName() {
        return paymentMethod.getMethodName();
    }

    String getAccountNumber() {
        return paymentMethod.getAccountNumber();
    }

    String getAccountName() {
        return paymentMethod.getAccountName();
    }

    void pay(String account) {
        paymentMethod.pay(account);
    }
}
