public class Bank {

    private int accountNumber;
    private String accountType;
    private String accountName;
    private double balance;
    private String phoneNumber;
    private String email;

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public String getAccountName() {
        return accountName;
    }

    public double getBalance() {
        return balance;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public double withdraw(int accountNumber, double amount) {

        if ((this.balance - amount) < 0 || amount <= 0 || this.accountNumber != accountNumber) {
            return -1;
        }
        setBalance(this.balance - amount);
        return this.balance - amount;
    }

    public double deposit(int accountNumber, double amount) {
        if (amount <= 0) {
            return -1;
        }

        if (accountNumber != this.accountNumber){
            return -2;
        }

        setBalance(this.balance + amount);

        return this.balance + amount;
    }

}
