package stocks;

import enums.StockPositionStatus;
import stocks.stockMarket.Stock;

public class CustomerStockPosition {

    private Stock stock;

    private int accountNumber;

    private double boughtPrice;

    private int quantity;

    private int initialQuantity;

    private double soldPrice;

    private StockPositionStatus stockPositionStatus;

    private double realizedProfit=0;

    private double unrealizedProfits=0;

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public double getBoughtPrice() {
        return boughtPrice;
    }

    public void setBoughtPrice(double boughtPrice) {
        this.boughtPrice = boughtPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public StockPositionStatus getStockPositionStatus() {
        return stockPositionStatus;
    }

    public void setStockPositionStatus(StockPositionStatus stockPositionStatus) {
        this.stockPositionStatus = stockPositionStatus;
    }

    public double getRealizedProfit() {
        return realizedProfit;
    }

    public void setRealizedProfit(double realizedProfit) {
        this.realizedProfit = realizedProfit;
    }

    public double getUnrealizedProfits() {
        return unrealizedProfits;
    }

    public void setUnrealizedProfits(double unrealizedProfits) {
        this.unrealizedProfits = unrealizedProfits;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getInitialQuanity() {
        return initialQuantity;
    }

    public void setInitialQuanity(int initialQuanity) {
        this.initialQuantity = initialQuanity;
    }

    public double getSoldPrice() {
        return soldPrice;
    }

    public void setSoldPrice(double soldPrice) {
        this.soldPrice = soldPrice;
    }

    public CustomerStockPosition(int accountNumber, double boughtPrice, int initialQuanity, StockPositionStatus stockPositionStatus) {
        this.accountNumber = accountNumber;
        this.boughtPrice = boughtPrice;
        this.initialQuantity = initialQuanity;
        this.quantity=initialQuanity;
        this.stockPositionStatus = stockPositionStatus;
    }


    public CustomerStockPosition(int accountNumber, double boughtPrice, int initialQuanity, StockPositionStatus stockPositionStatus, Stock stock) {
        this.accountNumber = accountNumber;
        this.boughtPrice = boughtPrice;
        this.initialQuantity = initialQuanity;
        this.quantity=initialQuanity;
        this.stockPositionStatus = stockPositionStatus;
        this.stock=stock;
    }
    public CustomerStockPosition(int accountNumber, double boughtPrice, int initialQuanity, int quantity, StockPositionStatus stockPositionStatus) {
        this.accountNumber = accountNumber;
        this.boughtPrice = boughtPrice;
        this.initialQuantity = initialQuanity;
        this.quantity=quantity;
        this.stockPositionStatus = stockPositionStatus;
    }


}
