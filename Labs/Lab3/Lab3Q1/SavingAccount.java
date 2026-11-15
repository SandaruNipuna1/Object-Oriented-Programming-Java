package Lab3Q1;

import java.util.Scanner;
public class SavingAccount {
    private int accountNumber;
    private String name;
    private double balance;

    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ". " + "New balance: " + balance);
        }
        else {
            System.out.println("Amount can't be negative.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ". " + "New balance: " + balance);
        }
        else {
            System.out.println("No sufficient funds.");
        }
    }
        public void displayAccountDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        setAccountNumber(scanner.nextInt());

        scanner.nextLine();

        System.out.print("Enter Account Holder Name: ");
        setName(scanner.nextLine());

        System.out.print("Enter Initial Deposit: ");
        deposit(scanner.nextDouble());

        System.out.print("Enter Deposit Amount: ");
        deposit(scanner.nextDouble());

        System.out.print("Enter Withdrawal Amount: ");
        withdraw(scanner.nextDouble());

            System.out.println("\nFinal Account Details:");
            System.out.println("Account Number: " + getAccountNumber());
            System.out.println("Account Holder: " + getName());
            System.out.println("Balance: " + getBalance());
        }
        public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount();
        savingAccount.displayAccountDetails();
        }
}
