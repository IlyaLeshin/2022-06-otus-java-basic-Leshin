package ru.otus.homeworks.hw6;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

class ClientAccount<Client, Account> {

    private final Map<Client, Collection<Account>> clientAccounts = new HashMap<>();
    private final Map<Account,Client> accountOfClient = new HashMap<>();

    public Collection<Account> getAccountOfClient(Client client) {
        return clientAccounts.getOrDefault(client, Collections.emptyList());
    }

    public Client getClientByAccount(Account account){
        return accountOfClient.get(account);
    }

    public void put(Client client, Account account) {
        clientAccounts.computeIfAbsent(client, Client -> new ArrayList<>()).add(account);
        accountOfClient.put(account,client);
    }

    public void print(){
        System.out.println(clientAccounts);
        System.out.println(accountOfClient);
    }
}