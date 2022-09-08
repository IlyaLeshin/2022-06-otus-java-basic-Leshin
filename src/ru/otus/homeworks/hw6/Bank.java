package ru.otus.homeworks.hw6;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Bank {

    protected static List<Account> getAccountsOfClient(ClientAccount<Client, Account> clientAccount, Client client){
        List<Account> findedAccount = new ArrayList<>();
        findedAccount.addAll((clientAccount.getAccountOfClient(client)));
        return findedAccount;
    }

    protected static Object findClientByAccount(ClientAccount<Client,Account> clientAccount, Account account){
        return clientAccount.getClientByAccount(account);
    }

    static void addClientAccounts(List<Client> clients, List<Account> accounts, ClientAccount<Client, Account> clientAccounts) {
        clientAccounts.put(clients.get(0), accounts.get(0));
        clientAccounts.put(clients.get(0), accounts.get(1));
        clientAccounts.put(clients.get(1), accounts.get(2));
        clientAccounts.put(clients.get(2), accounts.get(3));
        clientAccounts.put(clients.get(3), accounts.get(4));
        clientAccounts.put(clients.get(3), accounts.get(5));
    }
    }