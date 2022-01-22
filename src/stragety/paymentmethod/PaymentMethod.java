package stragety.paymentmethod;

public interface PaymentMethod {
    String getMethodName();
    String getAccountNumber();
    String getAccountName();
    void pay(String account);
}
