import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class GUISavingViewTransactions extends MyBankGUI {
    protected GUISavingViewTransactions() {
        super();
    }

    protected static void viewSavingTransactions(JScrollPane pane) {
        JTable tbl2 = new JTable();
        Object[] columns2 = {"Transaction Type", "Amount", "Remaining Balance"};
        DefaultTableModel model2 = new DefaultTableModel();

        model2.setColumnIdentifiers(columns2);
        tbl2.setModel(model2);
        tbl2.setRowHeight(30);
        tbl2.setAutoCreateRowSorter(true);

        pane = new JScrollPane();

        Object[] rowSaving = new Object[4];

        confirmSavingDeposit.addActionListener(action -> {
            rowSaving[0] = depositSavingLabel.getText();
            rowSaving[1] = depositSavingText.getText();
            rowSaving[2] = balanceLabel.getText();   // change

            model2.addRow(rowSaving);
        });

        transfer.addActionListener(action -> {
            rowSaving[0] = transferLabel.getText();
            rowSaving[1] = transferText.getText();
            rowSaving[2] = balanceLabel.getText();

            model2.addRow(rowSaving);
        });

        p51 = pane;
    }
}
