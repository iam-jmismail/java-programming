package org.example;

abstract class ILocker {
    abstract void openLocker();

    abstract void closeLocker();
}

class Locker extends ILocker {
    @Override
    public void openLocker() {
        System.out.println("Locker Opened");
    }

    @Override
    public void closeLocker() {
        System.out.println("Locker Closed");
    }
}

class Vault extends ILocker {
    @Override
    public void openLocker() {
        System.out.println("Vault Opened");
    }

    @Override
    public void closeLocker() {
        System.out.println("Vault Closed");
    }
}

class Bank extends Locker {
    private double balance;

    public Bank(double initialBalance) {
        balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (balance > 0 && amount <= balance) {
            balance -= amount;
        }
    }
}


public class OOP {


    public static void main(String[] args) {

        // Core Concepts of org.example.OOP:
        // 1: Encapsulation, 2: Inheritance, 3: Polymorphism, 4: Abstraction

        // Encapsulation : Hiding Internal details of a class and exposing only necessary parts.
        Bank bank = new Bank(1000);
        System.out.println(bank.getBalance());
        bank.deposit(150);
        System.out.println(bank.getBalance());
        bank.withdraw(1150);
        System.out.println(bank.getBalance());

        // 2: Inheritance: subclass derives the properties and behavior of a superclass
        bank.openLocker(); // Locker Class
        bank.closeLocker();

        // 3: Polymorphism: Method, Class or interface behave differently based on Context
        // 3A : Compile Time Polymorphism - Method Overloading
        // 3B : Runtime Polymorphism - Method Overriding.


        // 4. Abstraction : Hiding the implementation details and showing only essential functionality.
        Vault vault = new Vault();
        vault.openLocker();
        vault.closeLocker();
    }

}
