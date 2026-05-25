package services.interfaces;

import entities.BankAccount;

public interface BankAccountService {

    void create(BankAccount bankAccount);
    void listAll();

}
