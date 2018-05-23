package com.day3Java;

public class Account {
    private String name;
    private int balance;

    public void deposit(int amount) {
        this.balance += amount;

    }

    public String getName() {
        return this.name;
    }

    public int getBalance() {
        return this.balance;
    }

    public void setAmount(int amount) {
        this.balance = amount;
    }

}
