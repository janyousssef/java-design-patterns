package com.jan.command.domain;

public class BankUser {
    private String name;
    private long balance;

    public BankUser(String name, long balance) {
        this.name = name;
        this.balance = balance;
    }

    public void deposit(long amount) {
        balance += amount;
    }

    public void withdraw(long amount) {
        balance -= amount;
    }

    public void printBalance() {
        System.out.println("Balance of " + name + " is " + balance);
    }

    @Override
    public String toString() {
        return "BankUser{" +
                "name='" + name + '\'' +
                '}';
    }
}
