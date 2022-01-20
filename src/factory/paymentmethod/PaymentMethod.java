package factory.paymentmethod;

public interface PaymentMethod {
    String getMethodName();
    String getAccountNumber();
    String getAccountName();
    void pay(String account);
}
