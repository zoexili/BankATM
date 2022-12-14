import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class GUICustomerList extends MyBankGUI {
    protected GUICustomerList() {
        super();
    }

    protected static void createCustomerList(JScrollPane pane) {
        JTable tbl = new JTable();
        Object[] columns = {"Account Name","Account Type","Transaction Type", "Amount", "Remaining Balance"};
        // Object[] columns = {"Account Name","Account Type");
        DefaultTableModel model = new DefaultTableModel();

        model.setColumnIdentifiers(columns);
        tbl.setModel(model);
        tbl.setRowHeight(30);
        tbl.setAutoCreateRowSorter(true);

        pane = new JScrollPane(tbl);

        Object[] row = new Object[4];


        confirmWithdraw.addActionListener(action -> {
            row[0] = withdrawLabel.getText();
            row[1] = withdrawText.getText();
            row[2] = balanceLabel.getText();

            model.addRow(row);
        });

        confirmDeposit.addActionListener(action -> {
            row[0] = depositLabel.getText();
            row[1] = depositText.getText();
            row[2] = balanceLabel.getText();

            model.addRow(row);
        });

        loanSubmit.addActionListener(action -> {
            row[0] = loanLabel.getText();
            row[1] = loanText.getText();
            row[2] = balanceLabel.getText();

            model.addRow(row);
        });


        p50 = pane;
    }

}

