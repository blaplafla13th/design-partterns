package builder;

public class Account {
    private String userName;
    private String password;
    private String name;
    private String email;

    public Account() {
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public boolean checkPassword(String password) {
        return this.password.equals(hashPassword(password));
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPassword(String oldPassword, String newPassword) {
        oldPassword = hashPassword(oldPassword);
        newPassword = hashPassword(newPassword);
        if (password.equals(oldPassword))
            this.password = newPassword;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String hashPassword(String text) {
        return text; // validate step
    }

    public boolean checkEmail(String email) {
        return true; // validate step
    }

    @Override
    public String toString() {
        return "builder.Account{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
