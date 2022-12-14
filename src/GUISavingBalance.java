import javax.swing.*;

public class GUISavingBalance extends MyBankGUI{
    protected GUISavingBalance() {
        super();
    }

    protected static void viewSavingBalance(JPanel panel) {
        balanceSavingLabel = new JLabel("Balance: " + saveAccount.getBalance().getWalletValueinUSD());
        balanceSavingLabel.setBounds(10, 20, 80, 25);
        panel.add(balanceSavingLabel);

        backToSavingMenu3 = new JButton("Back To Menu");
        panel.add(backToSavingMenu3);

        p16 = panel;
    }
}
