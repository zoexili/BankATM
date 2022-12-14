import javax.swing.*;

public class GUIUtils extends MyBankGUI{
    protected GUIUtils() {
        super();
    }

    protected static Double getAmount(JTextField amount) {
        String s = amount.getText();
        Double d = Double.parseDouble(s);
        return d;
    }

    protected static void updateCheckBalanceLabel() {
        System.out.println("a");
        balanceLabel.setText("Balance: " + checkAccount.getBalance().getCurrencyList().get(0).getQuantity());
    }

    protected static void updateSaveBalanceLabel() {
        balanceLabel.setText("Balance: " + saveAccount.getBalance().getCurrencyList().get(0).getQuantity());
    }



}
