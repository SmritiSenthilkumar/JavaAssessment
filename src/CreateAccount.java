public class CreateAccount {
    public static BankAccount createAccount(String accountType){
        return switch (accountType.toLowerCase()) {
            case "current" -> new CurrentAccount(); // create current account
            case "savings" -> new SavingsAccount(); // create savings account
            case "loan" -> new LoanAccount(); // create loan account
            default -> throw new IllegalArgumentException("Invalid Account Type");
        };
    }
}
