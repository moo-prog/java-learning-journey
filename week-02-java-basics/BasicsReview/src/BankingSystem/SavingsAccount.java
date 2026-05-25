package BankingSystem;

public class SavingsAccount extends Account{
    private double interestRate;
    public SavingsAccount(String accountNumber, String ownerName, double balance, double interestRate){
        super(accountNumber, ownerName, balance);
        this.interestRate=  interestRate;
    }
    public void addInterest(){
        double interest = getBalance() * interestRate;
        deposit(interest);
        System.out.println("Interest of $" + interest + " has been added to your account.");
    }

    public double getInterestRate() { return interestRate; }
    public void setInterestRate(double interestRate) { this.interestRate = interestRate; }
}

