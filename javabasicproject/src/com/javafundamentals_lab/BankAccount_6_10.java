// 2 + 1 main
package com.javafundamentals_lab;

public class BankAccount_6_10 {

    static int balance = 1000;

    int deposit(int amount) {
        balance += amount;
        return balance;
    }

    int withdraw(int amount) {
        balance -= amount;
        return balance;
    }

    public static void main(String[] args) {

        BankAccount_6_10 t1 = new BankAccount_6_10();

        t1.deposit(500);
        t1.withdraw(300);

        System.out.println("Final Balance: " + balance);
    }
}
