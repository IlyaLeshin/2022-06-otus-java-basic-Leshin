package ru.otus.homeworks.hw6;

import java.time.YearMonth;
import java.util.Objects;

class Client {
    private final String clientID;
    private final String name;
    private final int yearOfBirth;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return name.equals(client.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "[clientID: "+clientID+" {Name = " + name + ", yearOfBirth = " + yearOfBirth + "}]";
    }

    protected Client(String name, int yearOfBirth) {
        clientID = IdCounter.createClientID();
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public String getClientID() {
        return clientID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        int CurrentYear = YearMonth.now().getYear();
        return  CurrentYear - yearOfBirth;
    }
}
