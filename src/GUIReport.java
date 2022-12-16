import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class GUIReport extends MyBankGUI {
    protected GUIReport() {
        super();
    }

    protected static void createReport(JScrollPane pane) {
        JTable tbl3 = new JTable();
        Object[] columns3 = {"First Name","Last Name","Account Type","Transaction Type", "Amount", "Remaining Balance"};
        DefaultTableModel model3 = new DefaultTableModel();

        model3.setColumnIdentifiers(columns3);
        tbl3.setModel(model3);
        tbl3.setRowHeight(30);
        tbl3.setAutoCreateRowSorter(true);

        pane = new JScrollPane(tbl3);

        Object[] rowCustomer = new Object[6];

        logIn.addActionListener(action -> {
            rowCustomer[0] = firstNameText.getText();
            rowCustomer[1] = lastNameText.getText();
        });

        confirmWithdraw.addActionListener(action -> {
            rowCustomer[2] = "Checking";
            rowCustomer[3] = withdrawLabel.getText();
            rowCustomer[4] = withdrawText.getText();
            rowCustomer[5] = balanceLabel.getText();

            model3.addRow(rowCustomer);
        });

        confirmDeposit.addActionListener(action -> {
            rowCustomer[2] = "Checking";
            rowCustomer[3] = depositLabel.getText();
            rowCustomer[4] = depositText.getText();
            rowCustomer[5] = balanceLabel.getText();

            model3.addRow(rowCustomer);
        });

        loanSubmit.addActionListener(action -> {
            rowCustomer[2] = "Checking";
            rowCustomer[3] = "Request Loan";
            rowCustomer[4] = loanText.getText();
            rowCustomer[5] = balanceLabel.getText();

            model3.addRow(rowCustomer);
        });

        payloanSubmit.addActionListener(action -> {
            rowCustomer[2] = "Checking";
            rowCustomer[3] = "Pay Loan";
            rowCustomer[4] = payloanText.getText();
            rowCustomer[5] = balanceLabel.getText();

            model3.addRow(rowCustomer);
        });

        confirmSavingDeposit.addActionListener(action -> {
            rowCustomer[2] = "Saving";
            rowCustomer[3] = depositSavingLabel.getText();
            rowCustomer[4] = depositSavingText.getText();
            rowCustomer[5] = balanceSavingLabel.getText();

            model3.addRow(rowCustomer);
        });

        confirmTransfer.addActionListener(action -> {
            rowCustomer[2] = "Saving";
            rowCustomer[3] = "Transfer to Checking";
            rowCustomer[4] = transferText.getText();
            rowCustomer[5] = balanceSavingLabel.getText();

            model3.addRow(rowCustomer);
        });


        p52 = pane;
    }

}

