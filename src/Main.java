import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter you name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your account type (current/savings/loan) : ");
        String accountType = scanner.nextLine();

        BankAccount account = CreateAccount.createAccount(accountType);
        double interestRate = account.getInterestRate();
        DecimalFormat df = new DecimalFormat("#.00");


        System.out.println("Hello, " + name + " !");
        System.out.println("Your " + accountType + " account has an interest rate of " + df.format(interestRate*100) + "%." );

        System.out.println("Enter the amount to deposit: ");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);

        System.out.println("Enter the number of months to calculate interest: ");
        int months = scanner.nextInt();
        double interestCalculated = account.calculateInterest(months);

        String formattedInterest = df.format(interestCalculated);
        System.out.println("Interest over " + months + " months is ₹" + formattedInterest);

        scanner.close();
    }
}