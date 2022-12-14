package account;


import currency.Balance;
import currency.Currency;
import exceptions.BalanceInsufficientException;
import exceptions.CurrencyNotFoundException;
import stocks.CustomerStockPosition;
import stocks.stockMarket.Stock;
import stocks.StockWallet;
import stocks.stockMarket.Stock;

import java.util.ArrayList;
import java.util.List;

public class Security extends Account{

    //Attributes


    private List<CustomerStockPosition> customerStockPositionList = new ArrayList<>();

    //Constructors
    public Security(int accountNumber, boolean closed, Balance balance, List<CustomerStockPosition> list) {
        super(accountNumber, closed, balance);
        this.customerStockPositionList = list;
    }

    public Security(int accountNumber, boolean closed, Balance balance) {
        super(accountNumber, closed, balance);
        this.customerStockPositionList=new ArrayList<>();
    }

    //Methods
    public void buyStock(Stock stock, int noofStocks) throws BalanceInsufficientException, CurrencyNotFoundException {
        this.getBalance().substractbalance(new Currency("USD", "USD",  stock.getPrice()));
//        CustomerStockPosition customerStockPosition = new CustomerStockPosition()
//        this.customerStockPositionList.add(stock);
    }

    public static Security openAccount(Balance balance) {
        return new Security(Account.ACCOUNT_NUMBER++, false, balance, new ArrayList<>());
    }

    //Getters and Setters
//    public List<Stock> getStocksList() {
//        List<Stock> stocksList;
//        return stocksList;
//    }
//    public void setStocksList(List<Stock> stocksList) {
//        this.stocksList = stocksList;
//    }

    public static void buyStocks(int stockId,int quantity)
    {

    }
}
