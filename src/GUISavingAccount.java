import javax.swing.*;

public class GUISavingAccount extends MyBankGUI{
    protected GUISavingAccount() {
        super();
    }

    protected static void createSavingAccount(JPanel panel) {
        JLabel msg = new JLabel("Hello! Welcome to your new Saving bank account: ");
        panel.add(msg);
        depositSaving = new JButton("Deposit Money");
        panel.add(depositSaving);
        transfer = new JButton("Transfer Money");
        panel.add(transfer);
        interest = new JButton("View interest");
        panel.add(interest);
        viewSavingHistory = new JButton("View Transaction History");
        panel.add(viewSavingHistory);
        viewSavingBalance = new JButton("View current Balance");
        panel.add(viewSavingBalance);
        backToMainMenuSaving = new JButton("Back to Main Menu");
        panel.add(backToMainMenuSaving);

        p13 = panel;
    }

}

