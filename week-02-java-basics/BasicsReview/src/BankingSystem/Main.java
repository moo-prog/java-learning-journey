package BankingSystem;

public class Main {
    public static void main (String[] args){
        SavingsAccount ahmedSavings = new SavingsAccount("54101", "Ahmed", 1000.0, 0.05);
        ahmedSavings.printInfo();
        ahmedSavings.addInterest();
        CheckingAccount mohamedChecking = new CheckingAccount("58202", "Mohamed", 200.0, 500.0);
        mohamedChecking.printInfo();
        mohamedChecking.withdraw(600);
        mohamedChecking.deposit(1000);
        mohamedChecking.withdraw(2000);
    }
}
