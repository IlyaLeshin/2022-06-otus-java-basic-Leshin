package ru.otus.homeworks.hw6;

import java.util.Objects;

class Account {

    private final String accountID;
    private long balance;
    private final CurrencyKind currency;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return accountID.equals(account.accountID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountID);
    }

    @Override
    public String toString() {
        return "[accountID: " + accountID + " {balance = " + balance + " " + currency + "}]";
    }

    public Account(long balance, CurrencyKind currency) {
        if (balance < 0)
            throw new IllegalArgumentException("balance must be > 0");

        accountID = IdCounter.createAccountID();
        this.balance = balance;
        this.currency = currency;
    }

    public Account(long balance) {
        this(balance, CurrencyKind.GOLD_COIN);
    }

    public String getAccountID() {
        return accountID;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public CurrencyKind getCurrency() {
        return currency;
    }
}