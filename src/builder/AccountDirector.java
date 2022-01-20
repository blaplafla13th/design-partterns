package builder;

public class AccountDirector {
    private AccountBuilder builder;

    public AccountDirector(AccountBuilder builder) {
        this.builder = builder;
    }

    public void sign() {
        builder.step1();
        builder.step2();
    }

    public Account getAccount() {
        return builder.getAccount();
    }
}
