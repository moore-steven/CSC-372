package module2;

//Import required modules 

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

// import BankAccount class from Module 1 for bank account functions
import module1.BankAccount;


//Create GUI class that is an extension of JFrame class and implements the Action Listener function
public class GUI extends JFrame implements ActionListener {
	
	// initialize BankAccount class instance and all necessary fields and buttons
	private BankAccount account = new BankAccount();
	private JFormattedTextField adjField;
	private JFormattedTextField cbalanceField;
	private JFormattedTextField balanceField;
	private JButton enterBalance;
	private JButton quit;
	private JButton deposit;
	private JButton withdraw;
	
		GUI() {
		
		// create layout function
			
		GridBagConstraints layoutConst = new GridBagConstraints();
		
		
		
		// create required labels
		JLabel balanceLabel = new JLabel("Enter Starting Balance:");
		JLabel cbalanceLabel = new JLabel("Current Balance:");
		JLabel adjLabel = new JLabel("Enter Transaction Value:");
		
		// create editable balance field that will accept initial balance value
		
		balanceField = new JFormattedTextField(15);
		balanceField.setEditable(true);
		balanceField.setText("0");
		balanceField.setColumns(10);
		
		// create editable adjustment field that will accept values for withdrawal or deposit
		
		adjField = new JFormattedTextField(15);
		adjField.setEditable(true);
		adjField.setText("0");
		adjField.setColumns(10);
		
		// create balance field that is not editable; will be used to display current balance
		
		cbalanceField = new JFormattedTextField(NumberFormat.getNumberInstance());;
		cbalanceField.setEditable(false);
		cbalanceField.setText("0");
		cbalanceField.setColumns(10);
		
		// create panel that will hold all buttons and fields
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridBagLayout());
		panel.setBackground(Color.cyan);
		
		// create button that will be used to submit the starting balance value
		
		enterBalance = new JButton("Submit Starting Balance");
		enterBalance.addActionListener(this);
		layoutConst.gridx = 3;
		layoutConst.gridy = 0;
		layoutConst.insets = new Insets(10, 10, 10, 10);
		panel.add(enterBalance, layoutConst);
		
		// create button that will be used to initiate a deposit
		
		deposit = new JButton("Deposit");
		deposit.addActionListener(this);
		layoutConst.gridx = 3;
		layoutConst.gridy = 5;
		layoutConst.insets = new Insets(10, 10, 10, 10);
		panel.add(deposit, layoutConst);
		
		// create button that will be used to initiate a withdrawal
		
		withdraw = new JButton("Withdraw");
		withdraw.addActionListener(this);
		layoutConst.gridx = 4;
		layoutConst.gridy = 5;
		layoutConst.insets = new Insets(10, 10, 10, 10);
		panel.add(withdraw, layoutConst);
		
		// create button that will be used to quit
		
		quit = new JButton("Quit");
		quit.addActionListener(this);
		layoutConst.gridx = 5;
		layoutConst.gridy = 10;
		layoutConst.insets = new Insets(10, 10, 10, 10);
		panel.add(quit, layoutConst);
		
		// add previously created fields
		
		layoutConst.gridx = 1;
		layoutConst.gridy = 0;
		layoutConst.insets = new Insets(10, 10, 10, 10);
		panel.add(balanceField, layoutConst);
		
		layoutConst.gridx = 1;
		layoutConst.gridy = 5;
		layoutConst.insets = new Insets(10, 10, 10, 10);
		panel.add(adjField, layoutConst);
		
		layoutConst.gridx = 1;
		layoutConst.gridy = 10;
		layoutConst.insets = new Insets(10, 10, 10, 10);
		panel.add(cbalanceField, layoutConst);
		
		// add previously created labels
		
		layoutConst.gridx = 0;
		layoutConst.gridy = 0;
		layoutConst.insets = new Insets(10, 10, 10, 10);
		panel.add(balanceLabel, layoutConst);
		
		layoutConst.gridx = 0;
		layoutConst.gridy = 10;
		layoutConst.insets = new Insets(10, 10, 10, 10);
		panel.add(cbalanceLabel, layoutConst);
		
		layoutConst.gridx = 0;
		layoutConst.gridy = 5;
		layoutConst.insets = new Insets(10, 10, 10, 10);
		panel.add(adjLabel, layoutConst);
		
		layoutConst.gridx = 0;
		layoutConst.gridy = 0;
		layoutConst.insets = new Insets(1, 10, 1, 10);
		add(panel);
		
		
	}
		// method used to complete actions based on button events

		public void actionPerformed(ActionEvent event) {
			// variables used to perform functions
			double value;
			double balance;
			
			// create source event variable that will be used to determine which button was pressed
			
			JButton sourceEvent = (JButton) event.getSource();
			
			
			
			if (sourceEvent == enterBalance ) {
				
				// If the enter balance button is pressed, a double value is retrieved from the 
				// appropriate field, provided to the account class, and then the account class balance
				// is displayed in the balance field.
				
				value = ((Number) balanceField.getValue()).doubleValue();
				account.balance(value);
				cbalanceField.setText(Double.toString(account.getBalance()));
			} else if (sourceEvent== deposit) {
				
				// If the deposit button is pressed the value is compared to the current balance and if
				// the result will not overdraw the account the deposit is processed. If not, an error
				// message is presented. The updated balance is shown in the balance field.
				value = ((Number) adjField.getValue()).doubleValue();
				balance = account.getBalance();
				if (balance + value > 0) {
					account.deposit(value);
					cbalanceField.setText(Double.toString(account.getBalance()));
				} else {
					JOptionPane.showMessageDialog(this, "Error! This value will overdraw account");
				}
				
			} else if (sourceEvent == withdraw) {
				
				// If the withdraw button is pressed the value is compared to the current balance and if
				// the result will not overdraw the account the withdrawal is processed. If not, an error
				// message is presented. The updated balance is shown in the balance field.
				
				value = ((Number) adjField.getValue()).doubleValue();
				balance = account.getBalance();
				if (balance - value > 0) {
					account.withdrawal(value);
					cbalanceField.setText(Double.toString(account.getBalance()));
				} else {
					JOptionPane.showMessageDialog(this, "Error! This value will overdraw account");
				}

			} else if (sourceEvent == quit ) {
				
				// if the quit button is pressed the window will exit.
				
				dispose();
				
			}
	 }


		
	
		public static void main(String[] args) {
			
			// create instance of GUI class and then the instance is shown.
			
			GUI frame = new GUI();
			
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.pack();
			frame.setTitle("Bank Account");
			frame.setVisible(true);
			
}


			
		
}
