package entities;

public class SavingAccount extends BankAccount{

    private long rate;
    private String typeAccount;

    public SavingAccount(String numberAccount, String client, double balance, long rate, String typeAccount) {
        super(numberAccount, client, balance);
        this.rate = rate;
        this.typeAccount = typeAccount;
    }

    public long getRate() {
        return rate;
    }

    public void setRate(long rate) {
        this.rate = rate;
    }

    public String getTypeAccount() {
        return typeAccount;
    }

    public void setTypeAccount(String typeAccount) {
        this.typeAccount = typeAccount;
    }

    @Override
    public String toString() {
        return "SavingAccount{" +
                "rate=" + rate +
                ", typeAccount='" + typeAccount + '\'' +
                ", numberAccount='" + numberAccount + '\'' +
                ", client='" + client + '\'' +
                ", balance=" + balance +
                '}';
    }

    @Override
    public double retire() {
        return super.balance * 0.2;
    }
}
