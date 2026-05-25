package BankingSystem;

public class CheckingAccount extends Account {
   private double overdraftLimit;
    public CheckingAccount(String accountNumber, String ownerName, double balance, double overdraftLimit){
        super(accountNumber, ownerName, balance);
        this.overdraftLimit=  overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }
    public void setOverdraftLimit(double overdraftLimit){
        this.overdraftLimit= overdraftLimit;
    }
    @Override
    public void withdraw(double amount) {
        System.out.println("withdraw: " + amount);
        if (getBalance() + overdraftLimit >= amount) {

            setBalance(getBalance() - amount);

            System.out.println("Successfully withdrawn! Remaining Balance: $" + getBalance());
        } else {
            System.out.println("Transaction Failed: Exceeded overdraft limit of $" + overdraftLimit);
        }
    }
    }