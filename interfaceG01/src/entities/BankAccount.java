package entities;

public abstract class BankAccount {

    protected String numberAccount;
    protected String client;
    protected double balance;

    public BankAccount(String numberAccount, String client, double balance) {
        this.numberAccount = numberAccount;
        this.client = client;
        this.balance = balance;
    }

    public String getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(String numberAccount) {
        this.numberAccount = numberAccount;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "numberAccount='" + numberAccount + '\'' +
                ", client='" + client + '\'' +
                ", balance=" + balance +
                '}';
    }

    public abstract double retire();
}
