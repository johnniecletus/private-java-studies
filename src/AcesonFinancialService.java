public class AcesonFinancialService {
    public static void main(String[] args) {

        Bank bank = new Bank();

        bank.setAccountNumber(1234567432);
        bank.setAccountName("John Cletus");
        bank.setEmail("jhornelcle@gmail.com");
        bank.setPhoneNumber("+2347068619556");
        bank.setBalance(0);
        bank.setAccountType("Savings");

        int depositAmount = 50000;
        int withdrawAmount = 20000;

        double balanceAfterDeposit = bank.deposit(1234567432, depositAmount);

        if (balanceAfterDeposit == -1) {
            System.out.println("Deposit failed, deposit amount is less than 1 naira");
            return;
        }
        if (balanceAfterDeposit == -2) {
            System.out.println("Deposit failed, incorrect account number");
            return;
        }

        System.out.println("Successfully deposited " + depositAmount + ". Your balance is " + balanceAfterDeposit);


        double balanceAfterWithdraw = bank.withdraw(1234567432, withdrawAmount);

        if (balanceAfterWithdraw < 0) {
            System.out.println("Withdraw failed");
            return;
        }

        System.out.println("Successfully withdrawn " + withdrawAmount + ". Your balance is " + balanceAfterWithdraw);


    }
}
