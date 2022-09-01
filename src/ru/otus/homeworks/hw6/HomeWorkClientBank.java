package ru.otus.homeworks.hw6;

import java.util.List;

public class HomeWorkClientBank {
    public static void main(String[] args) {

        List<Client> clients = ClientDataBase.createClients();
        System.out.println(clients);
        System.out.println("----------------------------------");

        List<Account> accounts = AccountDataBase.createAccounts();
        System.out.println(accounts);
        System.out.println("----------------------------------");

        ClientAccount<Client, Account> clientAccounts = new ClientAccount<>();
        Bank.addClientAccounts(clients, accounts, clientAccounts);
        clientAccounts.print();
        System.out.println("----------------------------------");

        System.out.println("Вывод счетов клиента " + clients.get(3));
        System.out.println(Bank.getAccountsOfClient(clientAccounts, clients.get(3)));
        System.out.println("----------------------------------");

        System.out.println("счет: " + accounts.get(3) + " принадлежит клиенту: " + clientAccounts.getClientByAccount(accounts.get(3)));
        System.out.println(Bank.findClientByAccount(clientAccounts, accounts.get(3)));
        System.out.println("----------------------------------");

    }
}
