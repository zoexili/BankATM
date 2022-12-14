import javax.swing.*;

public class GUISavingTransfer extends MyBankGUI {
    protected GUISavingTransfer() {
        super();
    }

    protected static void createSavingTransfer(JPanel panel) {
        transferToAccountLabel = new JLabel("The Account Number You want to transfer your money to: ");
        transferToAccountLabel.setBounds(10, 20, 80, 25);
        panel.add(transferToAccountLabel);

        transferToAccountText = new JTextField(20);
        transferToAccountText.setBounds(60, 20, 50, 25);
        panel.add(transferToAccountText);

        transferLabel = new JLabel("Transfer Amount: ");
        transferLabel.setBounds(10, 20, 80, 25);
        panel.add(transferLabel);

        transferText = new JTextField(20);
        transferText.setBounds(60, 20, 50, 25);
        panel.add(transferText);

        confirmTransfer = new JButton("Confirm");
        panel.add(confirmTransfer);

        backToSavingMenu1 = new JButton("Back To Menu");
        panel.add(backToSavingMenu1);

        p14 = panel;
    }
}
