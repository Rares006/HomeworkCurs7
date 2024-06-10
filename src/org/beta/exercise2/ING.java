package org.beta.exercise2;

public class ING implements Bank {
    private double deposited;
    private double withdrawn;
    private double balance = 0.0;

    public ING(double deposited, double withdrawn) {
        this.deposited = deposited;
        this.withdrawn = withdrawn;
        if(balance + deposited > withdrawn) {
            this.balance = deposited - withdrawn;
        }else {
            this.balance += deposited;
            System.out.println("Insufficient funds.");
        }
    }

    public double accountBalance() {
        return balance;
    }

    public double getDeposited() {
        return deposited;
    }

    public double getWithdrawn() {
        return withdrawn;
    }

    @Override
    public double deposit() {
        balance += deposited;
        return balance;
    }

    @Override
    public double withdraw() {
        if (withdrawn <= balance) {
            balance -= withdrawn;
        } return balance;
    }

    @Override
    public double getBalance() {
        return balance;
    }
}