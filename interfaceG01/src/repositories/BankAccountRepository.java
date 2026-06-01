package repositories;

import entities.BankAccount;

import java.util.ArrayList;
import java.util.List;

public class BankAccountRepository {

    private List<BankAccount> list = new ArrayList<>();

    public void create(BankAccount bankAccount){
        list.add(bankAccount);
    }

    public void listAll(){
        list.forEach(System.out::println);
    }
}
