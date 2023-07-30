package lab_08_q1;

public class CheckingAccount extends BankAccount
{
    public CheckingAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.02;
    }
}
