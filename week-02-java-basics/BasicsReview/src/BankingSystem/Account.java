package BankingSystem;

public class Account {
    private String accountNumber;
    private String ownerName;
    private double balance;
    public Account (String accountNumber, String ownerName, double balance){
        this.accountNumber= accountNumber;
        this.ownerName= ownerName;
        this.balance= balance;
    }

    public double getBalance() { return balance; }
    public String getAccountNumber() { return accountNumber; }
    public String getOwnerName() { return ownerName; }

    public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }
    public void setBalance(double balance) { this.balance = balance; }
    public void setOwnerName(String ownerName) { this.ownerName = ownerName; }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposited: $" + amount + " | New Balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }
    public void withdraw(double amount){
        System.out.println("withdraw: " +amount);
        if (balance >= amount){
            balance=balance-amount;
            System.out.println("Successfully withdrawn! Remaining Balance: $" + balance);
        }else{
            System.out.println("Transaction Failed: You don't have enough money!");
        }
    }
    public void printInfo(){
        System.out.println("====== Account Info ======");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Current Balance: $" + balance);
        System.out.println("==========================");
    }
}
