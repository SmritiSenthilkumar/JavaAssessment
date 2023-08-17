public interface BankAccount {
    double getInterestRate();
    void deposit(double amount);
    double calculateInterest(int months);
}
