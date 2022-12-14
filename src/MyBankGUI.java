import account.Checking;
import account.Saving;
import currency.Balance;
import exceptions.BalanceInsufficientException;
import exceptions.CurrencyNotFoundException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Savepoint;

public class MyBankGUI extends JFrame implements ItemListener {
	// protected static BankAccount account;
	protected static account.Checking checkAccount;
	protected static account.Saving saveAccount;
	protected static JFrame frame;
	protected static JScrollPane p50, p51;
	protected static JPanel p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13,
			p14, p15, p16, p17, p18, p19, p20, p21, p22, p23, p24;
	protected CardLayout cl;
	protected JPanel cards;
	final static String loginPanel = "Card of user login";
	final static String registerPanel = "Card of user registration";
	final static String bankMenuPanel = "Card of bank menu";
	final static String CheckAccountMenuPanel = "Card of Checking Account menu";
	final static String cancelAccountPanel = "Card of Cancel Account";
	final static String withdrawPanel = "Card of Withdraw Money";
	final static String balancePanel = "Card of Balance";
	final static String depositPanel = "Card of Deposit";
	final static String currencyPanel = "Card of Currency Conversion";
	final static String loanPanel = "Card of Request Loan";
	final static String historyPanel = "Card of Transaction History";
	final static String accountTypePanel = "Card of Bank Account Type";
	final static String administratorLoginPanel = "Card of Administrator Login";
	final static String SaveAccountMenuPanel = "Card of Saving Account Menu";
	final static String transferPanel = "Card of Saving Account Transfer";
	final static String depositSavingPanel = "Card of Saving Account Deposit";
	final static String balanceSavingPanel = "Card of Saving Account Balance";
	final static String interestSavingPanel = "Card of Saving Account Interest";
	final static String TransactionSavingPanel = "Card of Saving Account Transactions";
	protected static JButton register;
	protected static JButton submitRegister;
	protected static JButton logIn;
	protected static JButton openAccount;
	protected static JButton closeAccount;
	protected static JButton checkingAccount;
	protected static JButton savingAccount;
	protected static JButton submitFeedback;
	protected static JButton backToLogin;  // back to login page
	protected static JButton backToMainMenu;  // back to open/close account page
	protected static JButton backToBankMenu;  // back to bank operation menu page (balance panel).
	protected static JButton backToBankMenu1;  // back to bank operation menu page (withdraw panel)
	protected static JButton backToBankMenu2;  // back to bank page (deposit panel).
	protected static JButton backToMainMenuSaving;  // back to open/close account page
	protected static JButton backToSavingMenu1;  // back to saving bank operation menu
	protected static JButton backToSavingMenu2;
	protected static JButton backToSavingMenu3;
	protected static JButton backToSavingMenu4;
	protected static JButton withdraw;
	protected static JButton confirmWithdraw;
	protected static JButton deposit;
	protected static JButton confirmDeposit;
	protected static JButton viewHistory;
	protected static JButton viewBalance;
	protected static JButton exchangeCurrency;
	protected static JButton requestLoan;
	protected static JButton loanSubmit;
	protected static JButton toPound;
	protected static JButton toEuro;
	protected static JButton administratorLogIn;
	protected static JButton toYuan;
	protected static JButton administratorBack;
	protected static JButton historyBack;
	protected static JButton depositSaving;
	protected static JButton transfer;
	protected static JButton interest;
	protected static JButton viewSavingHistory;
	protected static JButton viewSavingBalance;
	protected static JButton confirmSavingDeposit;
	protected static JButton confirmTransfer;
	protected static JLabel userLabel;
	protected static JLabel passwordLabel;
	protected static JLabel balanceLabel;
	protected static JLabel withdrawLabel;
	protected static JLabel depositLabel;
	protected static JLabel loanLabel;
	protected static JLabel transferLabel;
	protected static JLabel transferToAccountLabel;
	protected static JLabel depositSavingLabel;
	protected static JLabel interestLabel;
	protected static JLabel balanceSavingLabel;
	protected static JTextField userText;
	protected static JTextField passText;
	protected static JTextField withdrawText;
	protected static JTextField depositText;
	protected static JTextField loanText;
	protected static JTextField userNameText;
	protected static JTextField passwordText;
	protected static JTextField firstNameText;
	protected static JTextField lastNameText;
	protected static JTextField emailText;
	protected static JTextField transferText;
	protected static JTextField transferToAccountText;
	protected static JTextField depositSavingText;



	// Constructor
	public MyBankGUI() {
		// account = new BankAccount();
		checkAccount = new account.Checking();
		saveAccount = new account.Saving();
		// initialize panels
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		p4 = new JPanel();
		p5 = new JPanel();
		p6 = new JPanel();
		p7 = new JPanel();
		p8 = new JPanel();
		p9 = new JPanel();
		p10 = new JPanel();
		p11 = new JPanel();
		p12 = new JPanel();
		p13 = new JPanel();
		p14 = new JPanel();
		p15 = new JPanel();
		p16 = new JPanel();
		p17 = new JPanel();
		p18 = new JPanel();



		p50 = new JScrollPane();
		p51 = new JScrollPane();


	}

	public void addComponentToPane(Container pane) {

		// implement methods to fill panels with elements
		GUILogin.createLogin(p1);
		GUIRegister.createRegister(p2);
		GUIBankMenu.createBankMenu(p3);
		GUICheckingAccount.createCheckingAccount(p4);
		GUICheckingAccount.cancelAccount(p5);
		GUIWithdraw.withdraw(p6);
		GUIBalance.showBalance(p7);
		GUIDeposit.deposit(p8);
		GUIExchangeCurrency.convertCurrency(p9);
		GUIRequestLoan.requestLoan(p10);
		GUICheckingSaving.chooseAccountType(p11);
		GUIAdministratorLogIn.createAdministratorLogIn(p12);
		GUISavingAccount.createSavingAccount(p13);
		GUISavingTransfer.createSavingTransfer(p14);
		GUISavingDeposit.createSavingDeposit(p15);
		GUISavingBalance.viewSavingBalance(p16);
		GUISavingInterest.viewInterest(p17);




		GUIViewTransactions.viewTransactions(p50);
		GUISavingViewTransactions.viewSavingTransactions(p51);


		// create a panel to contain cards
		cl = new CardLayout();
		cards = new JPanel(cl);
		cards.add(p1, loginPanel);
		cards.add(p2, registerPanel);
		cards.add(p3, bankMenuPanel);
		cards.add(p4, CheckAccountMenuPanel);
		cards.add(p5, cancelAccountPanel);
		cards.add(p6, withdrawPanel);
		cards.add(p7, balancePanel);
		cards.add(p8, depositPanel);
		cards.add(p9, currencyPanel);
		cards.add(p10, loanPanel);
		cards.add(p11, accountTypePanel);
		cards.add(p12, administratorLoginPanel);
		cards.add(p13, SaveAccountMenuPanel);
		cards.add(p14, transferPanel);
		cards.add(p15, depositSavingPanel);
		cards.add(p16, balanceSavingPanel);
		cards.add(p17, interestSavingPanel);



		cards.add(p50, historyPanel);
		cards.add(p51, TransactionSavingPanel);
		cl.show(cards, loginPanel);

		register.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(cards, registerPanel);
			}
		});

		submitRegister.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
//				if (firstNameText.getText().matches("^[a-zA-Z]+$") &&
//						lastNameText.getText().matches("^[a-zA-Z]+$") &&
//						userNameText.getText().matches("^[a-zA-Z]+$") &&
//						passwordText.getText().matches("^(?=.*[0-9])"
//						+ "(?=.*[a-z])(?=.*[A-Z])"
//						+ "(?=\\S+$).{6,20}$") && emailText.getText().matches("^(.+)@(.+)$")){
					cl.show(cards, loginPanel);
				}
//				else {
//					JOptionPane.showMessageDialog(frame, "Please do not leave any field empty. \n" +
//							"Your name needs to contain A/a-Z/z characters only. \n" +
//							"Your password needs to contain at least 1 digit, 1 lower case number, 1 upper case number, and at least 6 characters and no more than 20 characters.");
//					}
//				}
		});


		logIn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
//				if (userText.getText().isEmpty() || passText.getText().isEmpty()) {
//					JOptionPane.showMessageDialog(frame, "Your user name or password is empty. Please try again.");
//				}
//				else if (userText.getText().equals(userNameText.getText()) && (passText.getText().equals(passwordText.getText()))) {
					cl.show(cards, bankMenuPanel);
				}
//				else {
//					JOptionPane.showMessageDialog(frame, "Your user name or password is incorrect. Please try again.");
//				}
//			}
		});

		openAccount.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(cards, accountTypePanel);
			}
		});

		checkingAccount.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			//	checkAccount = new Checking();
				cl.show(cards, CheckAccountMenuPanel);
			}
		});

		savingAccount.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				saveAccount = new Saving();
				cl.show(cards, SaveAccountMenuPanel);
			}
		});

		closeAccount.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(cards, cancelAccountPanel);
			}
		});

		backToLogin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(cards, loginPanel);
			}
		});

		backToMainMenu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(cards, bankMenuPanel);
			}
		});

		backToMainMenuSaving.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(cards, SaveAccountMenuPanel);
			}
		});

		withdraw.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(cards, withdrawPanel);
			}
		});

		confirmWithdraw.addActionListener(action -> {
			if (withdrawText.getText().isEmpty()) {
				JOptionPane.showMessageDialog(frame, "Please enter a valid number.");
			}
			else if (GUIUtils.getAmount(withdrawText) > checkAccount.getBalance().getCurrencyList().get(0).getQuantity()) {
				JOptionPane.showMessageDialog(frame, "You cannot withdraw cash amount larger than your current balance.");
			}
			else if (GUIUtils.getAmount(withdrawText) <= 0) {
				JOptionPane.showMessageDialog(frame, "Please enter a positive number.");
			}
			else {
				try {
					checkAccount.withdraw(new Balance(GUIUtils.getAmount(withdrawText)));
				} catch (BalanceInsufficientException e) {
					throw new RuntimeException(e);
				} catch (CurrencyNotFoundException e) {
					throw new RuntimeException(e);
				}
				GUIUtils.updateCheckBalanceLabel();
				cl.show(cards, balancePanel);
			}
		});

		backToBankMenu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(cards, CheckAccountMenuPanel);
			}
		});

		backToBankMenu1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(cards, CheckAccountMenuPanel);
			}
		});

		deposit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(cards, depositPanel);
			}
		});

		confirmDeposit.addActionListener(action -> {
			if (depositText.getText().isEmpty()) {
				JOptionPane.showMessageDialog(frame, "Please enter a valid number.");
			}
			else if (GUIUtils.getAmount(depositText) <= 0) {
				JOptionPane.showMessageDialog(frame, "Please enter a positive number.");
			}
			else {
				try {
					checkAccount.deposit(new Balance(GUIUtils.getAmount(depositText)));
				} catch (BalanceInsufficientException e) {
					throw new RuntimeException(e);
				} catch (CurrencyNotFoundException e) {
					throw new RuntimeException(e);
				}
				GUIUtils.updateCheckBalanceLabel();  // change
				cl.show(cards, balancePanel);   // change
			}
		});

		backToBankMenu2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(cards, CheckAccountMenuPanel);
			}
		});

		viewBalance.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(cards, balancePanel);
			}
		});

		submitFeedback.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(cards, loginPanel);
			}
		});

		exchangeCurrency.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(cards, currencyPanel);
			}
		});


		toPound.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double pound = checkAccount.getBalance().getWalletValueinUSD() * 0.82;
				balanceLabel.setText("Balance: " + pound);
				cl.show(cards, balancePanel);
			}
		});

		toEuro.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double euro = checkAccount.getBalance().getWalletValueinUSD()  * 0.95;
				balanceLabel.setText("Balance: " + euro);
				cl.show(cards, balancePanel);
			}
		});

		toYuan.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double yuan = checkAccount.getBalance().getWalletValueinUSD()  * 6.96;
				balanceLabel.setText("Balance: " + yuan);
				cl.show(cards, balancePanel);
			}
		});

		requestLoan.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(cards, loanPanel);
			}
		});

		loanSubmit.addActionListener(action -> {
			if (loanText.getText().isEmpty()) {
				JOptionPane.showMessageDialog(frame, "Please enter a valid number.");
			}
			else if (GUIUtils.getAmount(loanText) <= 0) {
				JOptionPane.showMessageDialog(frame, "Please enter a positive number.");
			}
			else {
				try {
					checkAccount.deposit(new Balance(GUIUtils.getAmount(loanText)));
				} catch (BalanceInsufficientException e) {
					throw new RuntimeException(e);
				} catch (CurrencyNotFoundException e) {
					throw new RuntimeException(e);
				}
				GUIUtils.updateCheckBalanceLabel();
				cl.show(cards, balancePanel);
				JOptionPane.showMessageDialog(frame, "You successfully requested the loan of " + GUIUtils.getAmount(loanText) + ".");
			}
		});

		viewHistory.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(cards, historyPanel);
			}
		});

		administratorLogIn.addActionListener(action -> {
			if (userText.getText().isEmpty() || passText.getText().isEmpty()) {
				JOptionPane.showMessageDialog(frame, "Your admin user name or password is empty.");
			}
			else if (!userText.getText().equals("Bankmanager") || (!passText.getText().equals("Bank123"))) {
				JOptionPane.showMessageDialog(frame, "Your admin user name or password is incorrect. Please try again.");
			}
			else {
				cl.show(cards, administratorLoginPanel);
			}
		});

		administratorBack.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(cards, loginPanel);
			}
		});

		depositSaving.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(cards, depositSavingPanel);
			}
		});

		confirmSavingDeposit.addActionListener(action -> {
			if (depositSavingText.getText().isEmpty()) {
				JOptionPane.showMessageDialog(frame, "Please enter a valid number.");
			}
			else if (GUIUtils.getAmount(depositSavingText) <= 0) {
				JOptionPane.showMessageDialog(frame, "Please enter a positive number.");
			}
			else {
				try {
					saveAccount.deposit(new Balance(GUIUtils.getAmount(depositSavingText)));  // change
				} catch (BalanceInsufficientException e) {
					throw new RuntimeException(e);
				} catch (CurrencyNotFoundException e) {
					throw new RuntimeException(e);
				}
				GUIUtils.updateSaveBalanceLabel();  // this balance needs to be saving balance
				cl.show(cards, balanceSavingPanel);
			}
		});

		transfer.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(cards, transferPanel);
			}
		});

		confirmTransfer.addActionListener(action -> {
			if (transferText.getText().isEmpty()) {
				JOptionPane.showMessageDialog(frame, "Please enter a valid number.");
			}
			else if (GUIUtils.getAmount(transferText) <= 0) {
				JOptionPane.showMessageDialog(frame, "Please enter a positive number.");
			}
			else if (GUIUtils.getAmount(transferText) > saveAccount.getBalance().getWalletValueinUSD()) {
				JOptionPane.showMessageDialog(frame, "You don't have this much money in your account.");
			}
			else {
				try {
					saveAccount.transferMoney(checkAccount, new Balance(GUIUtils.getAmount(transferText)));
				} catch (BalanceInsufficientException e) {
					throw new RuntimeException(e);
				} catch (CurrencyNotFoundException e) {
					throw new RuntimeException(e);
				}
				GUIUtils.updateSaveBalanceLabel();  // this balance needs to be saving balance
				cl.show(cards, balanceSavingPanel);
			}
		});

		interest.addActionListener(action -> {
			if (saveAccount.getBalance().getWalletValueinUSD() >= 5000) {  // change to saving balance
				JOptionPane.showMessageDialog(frame, "You earn a 2% monthly interest by the end of each month.");
			}
			else {
				JOptionPane.showMessageDialog(frame, "Your balance is too low to earn any interest this month.");
			}
			cl.show(cards, interestSavingPanel);
		});

		viewSavingHistory.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(cards, TransactionSavingPanel);
			}
		});

		viewSavingBalance.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(cards, balanceSavingPanel);
			}
		});

		backToSavingMenu1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(cards, SaveAccountMenuPanel);
			}
		});

		backToSavingMenu2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(cards, SaveAccountMenuPanel);
			}
		});

		backToSavingMenu3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(cards, SaveAccountMenuPanel);
			}
		});

		backToSavingMenu4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(cards, SaveAccountMenuPanel);
			}
		});


		pane.add(cards, BorderLayout.CENTER);
	}

	public void itemStateChanged(ItemEvent evt) {
		CardLayout cl = (CardLayout)(cards.getLayout());
		cl.show(cards, (String)evt.getItem());
	}

	public static void createAndShowGUI() {
		// initialize frame.
		frame = new JFrame("Charles River Bank ATM");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//Create and set up the content pane.
		MyBankGUI gui = new MyBankGUI();
		gui.addComponentToPane(frame.getContentPane());
		frame.setSize(600, 650);
		// frame.setLocationRelativeTo(null);


		// Turn it on
		frame.pack();
		frame.setVisible(true);
	}

}
