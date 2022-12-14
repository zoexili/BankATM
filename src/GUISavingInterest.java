import javax.swing.*;

public class GUISavingInterest extends MyBankGUI{
    protected GUISavingInterest() {
        super();
    }

    protected static void viewInterest(JPanel panel) {
        interestLabel = new JLabel("Monthly Interest: 0.2%");
        panel.add(interestLabel);

        backToSavingMenu4 = new JButton("Back To Menu");
        panel.add(backToSavingMenu4);

        p17 = panel;
    }
}
