import javax.swing.*;

public class GUISavingDeposit extends MyBankGUI {
    protected GUISavingDeposit() {
        super();
    }

    protected static void createSavingDeposit(JPanel panel) {
        depositSavingLabel = new JLabel("Deposit");
        depositSavingLabel.setBounds(10, 20, 80, 25);
        panel.add(depositSavingLabel);

        depositSavingText = new JTextField(20);
        depositSavingText.setBounds(60, 20, 50, 25);
        panel.add(depositSavingText);

        confirmSavingDeposit = new JButton("Confirm");
        panel.add(confirmSavingDeposit);

        backToSavingMenu2 = new JButton("Back To Menu");
        panel.add(backToSavingMenu2);

        p15 = panel;
    }
}
