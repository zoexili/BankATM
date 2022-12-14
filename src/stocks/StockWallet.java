package stocks;

import java.util.ArrayList;
import java.util.List;

public class StockWallet {
    List<CustomerStockPosition> customerStockPositionList;

    public List<CustomerStockPosition> getCustomerStockPositionList() {
        return customerStockPositionList;
    }

    public void setCustomerStockPositionList(List<CustomerStockPosition> customerStockPositionList) {
        this.customerStockPositionList = customerStockPositionList;
    }

    public StockWallet(List<CustomerStockPosition> customerStockPositionList) {
        this.customerStockPositionList = customerStockPositionList;
    }

    public StockWallet( int accountNumber) {

        this.customerStockPositionList = new ArrayList<>();


    }
}
