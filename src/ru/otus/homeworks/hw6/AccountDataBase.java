package ru.otus.homeworks.hw6;

import java.util.ArrayList;
import java.util.List;

class AccountDataBase {

    public static List createAccounts() {
        List<Account> accounts = new ArrayList<>();

        Account account0 = new Account(1);
        accounts.add(account0);
        Account account1 = new Account(101);
        accounts.add(account1);
        Account account2 = new Account(202);
        accounts.add(account2);
        Account account3 = new Account(303);
        accounts.add( account3);
        Account account4 = new Account(404);
        accounts.add(account4);
        Account account5 = new Account(505);
        accounts.add(account5);

        return accounts;
    }

    public static void print(Iterable<Account> accounts) {
        for (Account account : accounts) {
            System.out.println("AccountID is: " + account.getAccountID());
            System.out.println("Balance is: " + account.getBalance());
        }
    }
}