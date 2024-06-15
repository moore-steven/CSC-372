package module1;

public class CheckingAccount extends BankAccount {
	private double interestRate;
	
	public void processWithdrawal (double dep) {
		if (dep > balance) {
			System.out.println("$30 Overdraft fee charged");
			balance = balance - dep - 30;
		} else {
		balance = balance - dep;
		}
	}
	public void setInterest (double interest) {
		interestRate = interest;
	}
	
	public void displayAccount() {
		this.accountSummary();
		System.out.print("Current Interest rate is: ");
		System.out.printf("%.2f", interestRate);
		System.out.println("%");
		
	}
	
	public static void main(String[] args) {
		
		// creation of test class
		CheckingAccount account2 = new CheckingAccount();
		
		// method demonstration
		account2.getBalance();
		account2.deposit(100);
		account2.getBalance();
		account2.withdrawal(25);
		account2.getBalance();
		account2.setfirstName("William");
		account2.getfirstName();
		account2.setlasttName("Carter");
		account2.getlastName();
		account2.setaccountID(2);
		account2.getaccountID();
		account2.getBalance();
		account2.accountSummary();
		account2.processWithdrawal(100);
		account2.getBalance();
		account2.setInterest(4.5);
		account2.displayAccount();

	}
}
