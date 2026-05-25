package services.impl;

import entities.BankAccount;
import repositories.BankAccountRepository;
import services.interfaces.BankAccountService;

public class BankAccountServiceImpl implements BankAccountService {

   private BankAccountRepository bankAccountRepository = new BankAccountRepository();

    @Override
    public void create(BankAccount bankAccount) {
        bankAccountRepository.create(bankAccount);
    }

    @Override
    public void listAll() {
        bankAccountRepository.listAll();
    }
}
