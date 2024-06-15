
public class BankAccount {
	// initialize fields
	private String firstName;
	private String lastName;
	private int accountID;
	private double balance;
	
	// Constructor that sets balance to 0
	public BankAccount() {
		balance = 0;
	}
	
	//method to enter deposit
	public void deposit (double dep) {
		balance = balance + dep;
	}
	
	//method to withdraw from account
	public void withdrawal (double wd) {
		balance = balance - wd;
	}
	
	
	//method to set first name
	public void setfirstName (String fname) {
		firstName = fname;
	}
	
	//method to get first name
	public void getfirstName () {
		System.out.println("Account Owner first name is " + firstName);
	}
	
	//method to set last name
	public void setlasttName (String lname) {
		lastName = lname;
	}
	
	//method to get last name
	public void getlastName () {
		System.out.println("Account Owner last name is " + lastName);
	}
	
	//method to set account ID
	public void setaccountID (int ID) {
		accountID = ID;
	}
	
	//method to get account ID
	public void getaccountID () {
		System.out.println("Account ID is " + accountID);
	}
	
	//method to get balance
	public void getBalance ( ) {
		System.out.print("Account Balance is $");
		System.out.printf("%.2f", balance);
		System.out.println();
	}
	
	//method to print an account summary of all relevant data
	public void accountSummary ( ) {
		System.out.println("Account ID: " + accountID);
		System.out.println("Account Owner: " + firstName + " " + lastName);
		System.out.print("Current Balance is $");
		System.out.printf("%.2f", balance);
		System.out.println();
	}
	


	public static void main(String[] args) {
		
		// creation of test class
		BankAccount account1 = new BankAccount();
		
		// method demonstration
		account1.getBalance();
		account1.deposit(100);
		account1.getBalance();
		account1.withdrawal(25);
		account1.getBalance();
		account1.setfirstName("Bill");
		account1.getfirstName();
		account1.setlasttName("Franklin");
		account1.getlastName();
		account1.setaccountID(1);
		account1.getaccountID();
		account1.getBalance();
		account1.accountSummary();

	}

}
