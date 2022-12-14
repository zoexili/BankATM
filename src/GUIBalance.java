import javax.swing.*;

public class GUIBalance extends MyBankGUI{
    protected GUIBalance() {
        super();
    }

    protected static void showBalance(JPanel panel) {
        balanceLabel = new JLabel("Balance: " + checkAccount.getBalance().getWalletValueinUSD());
        balanceLabel.setBounds(10, 20, 80, 25);
        panel.add(balanceLabel);

        backToBankMenu = new JButton("Back To Menu");
        panel.add(backToBankMenu);

        p7 = panel;
    }
}
