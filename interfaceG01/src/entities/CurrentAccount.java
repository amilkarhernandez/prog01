package entities;

public class CurrentAccount extends BankAccount{

    private int cantWithdrawals;

    public CurrentAccount(String numberAccount, String client, double balance, int cantWithdrawals) {
        super(numberAccount, client, balance);
        this.cantWithdrawals = cantWithdrawals;
    }

    public int getCantWithdrawals() {
        return cantWithdrawals;
    }

    public void setCantWithdrawals(int cantWithdrawals) {
        this.cantWithdrawals = cantWithdrawals;
    }

    @Override
    public String toString() {
        return "CurrentAccount{" +
                "cantWithdrawals=" + cantWithdrawals +
                ", numberAccount='" + numberAccount + '\'' +
                ", client='" + client + '\'' +
                ", balance=" + balance +
                '}';
    }

    @Override
    public double retire() {
        return super.balance * 0.3;
    }
}
