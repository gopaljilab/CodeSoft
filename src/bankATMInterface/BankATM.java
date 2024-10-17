package bankATMInterface;

import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Money Deposited: " + amount);
        } else {
            System.out.println("Invalid Amount for Deposit!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Money Withdrawn Successfully: " + amount);
        } else {
            System.out.println("Invalid Amount for Withdraw or Insufficient Funds");
        }
    }
}

class ATM {
    private BankAccount account;
    private Scanner scanner;

    public ATM(BankAccount account) {
        this.account = account;
        scanner = new Scanner(System.in);
    }

    public void showMenu() {
        System.out.println("******** WELCOME TO ATM *********");
        System.out.println("ATM Menu");
        System.out.println("1. Check Balance.");
        System.out.println("2. Deposit Cash.");
        System.out.println("3. Withdraw Cash.");
        System.out.println("4. Exit.");
    }

    public void start() {
        int choice;
        do {
            showMenu();
            System.out.print("Enter Your Choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    System.out.println("Exiting ATM. Thank You!");
                    break;
                default:
                    System.out.println("Invalid Choice. Please Select a Valid Option.");
            }
        } while (choice != 4); // Added while loop to keep the menu running until the user chooses to exit
    }

    private void checkBalance() {
        System.out.println("Current Balance: " + account.getBalance());
    }

    private void deposit() {
        System.out.print("Enter Deposit Amount: ");
        double amount = scanner.nextDouble();
        account.deposit(amount);
    }

    private void withdraw() {
        System.out.print("Enter Withdrawal Amount: ");
        double amount = scanner.nextDouble();
        account.withdraw(amount);
    }
}
