public class LoanAccount implements BankAccount {
    private double balance = 0;
    @Override
    public double getInterestRate(){
        return 0.10; // 10% Interest rate
    }

    @Override
    public void deposit(double amount) {
        balance+= amount;
    }

    @Override
    public double calculateInterest(int months) {
        return balance * getInterestRate() * months / 12; // (P*R*T)/100
    }
}
