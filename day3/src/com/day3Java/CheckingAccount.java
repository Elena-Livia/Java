package com.day3Java;

public class CheckingAccount extends Account {

    public CheckingAccount() {

    }

    public CheckingAccount(int amount) {
        this.setAmount(amount);
    }

    public void withdraw(int amount) {
        this.setAmount(amount);
    }
}
