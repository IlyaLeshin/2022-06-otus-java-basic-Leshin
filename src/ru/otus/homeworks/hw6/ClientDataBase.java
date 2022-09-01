package ru.otus.homeworks.hw6;

import java.util.ArrayList;
import java.util.List;

public class ClientDataBase {

    public static List<Client> createClients() {
        List<Client> clients = new ArrayList<>();
        Client client0 = new Client("person0", 1970);
        clients.add(client0);
        Client client1 = new Client("person1", 1980);
        clients.add(client1);
        Client client2 = new Client("person2", 1990);
        clients.add(client2);
        Client client3 = new Client("person3", 2000);
        clients.add(client3);

        return clients;
    }

    public static void print(Iterable<Client> clients) {
        for (Client client : clients) {
            System.out.println("Name is: " + client.getName());
            System.out.println("Age is: " + client.getAge());
            System.out.println("ID is: " + client.getClientID());
        }
    }
}