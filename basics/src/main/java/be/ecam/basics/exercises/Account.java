package be.ecam.basics.exercises;

import java.util.Objects;

public class Account {
    private long balance;
    // Stocker le solde en centime sur une variable long pour éviter les erreurs d'arrondi

    public Account() {
        this(0.0);
    }

    public Account(double initial) {
        this.balance = Math.round(initial * 100.0);
    }

    public double getBalance() {
        return balance / 100.0;
    }

    public void deposit(double amount) {
        if (amount < 0) throw new IllegalArgumentException("amount");
        balance += Math.round(amount * 100.0);
    }

    public void withdraw(double amount) {
        if (amount < 0) throw new IllegalArgumentException("amount");
        if (amount > balance) throw new IllegalStateException("insufficient");
        balance -= Math.round(amount * 100.0);
    }

    public void transferTo(Account other, double amount) {
        Objects.requireNonNull(other, "other");
        withdraw(amount);
        other.deposit(amount);
    }
}
