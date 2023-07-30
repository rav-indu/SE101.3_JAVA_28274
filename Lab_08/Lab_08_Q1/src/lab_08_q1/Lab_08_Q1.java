package lab_08_q1;

public class Lab_08_Q1 {

    public static void main(String[] args) 
    {
        // Create a SavingsAccount object with 20 million balance
        SavingsAccount savingsAccount = new SavingsAccount(12345, 20000000.0);

        // Calculate and display the interest for the savings account
        double savingsInterest = savingsAccount.calculateInterest();
        System.out.println("Interest for Savings Account: " + savingsInterest);

        // Create a CheckingAccount object with 1 million balance
        CheckingAccount checkingAccount = new CheckingAccount(67890, 1000000.0);

        // Calculate and display the interest for the checking account
        double checkingInterest = checkingAccount.calculateInterest();
        System.out.println("Interest for Checking Account: " + checkingInterest);
    }
    
}
