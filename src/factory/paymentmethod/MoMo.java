package factory.paymentmethod;

public class MoMo implements PaymentMethod {
    @Override
    public String getMethodName() {
        return "MoMo";
    }

    @Override
    public String getAccountNumber() {
        return "0123456789";
    }

    @Override
    public String getAccountName() {
        return "Blaplafla";
    }

    @Override
    public void pay(String account) {
        System.out.println("transfering");
    }
}
