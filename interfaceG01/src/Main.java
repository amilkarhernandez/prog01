import entities.BankAccount;
import entities.CurrentAccount;
import entities.SavingAccount;
import services.impl.BankAccountServiceImpl;
import services.interfaces.BankAccountService;

public class Main {
    public static void main(String[] args) {

        BankAccountService bankAccountService = new BankAccountServiceImpl();

        BankAccount b1 = new SavingAccount("123", "Jose Ramon", 2300000.0, 2L, "A1");
        BankAccount b2 = new CurrentAccount("334", "Fredy Julio", 1200000.0, 3);

        bankAccountService.create(b1);
        bankAccountService.create(b2);

        bankAccountService.listAll();

    }
}