package stocks.stockMarket;

import exceptions.DBQueryExecutionException;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static stocks.stockMarket.DBStockHelper.*;

public class StockMarket {
    Map<StockName, Stock> stocks ;

    private Boolean isStockMarketOpen=false;

    private static StockMarket stockMarket;

    public StockMarket(List<Stock> stocks, Boolean isStockMarketOpen) throws SQLException, DBQueryExecutionException {
        this.stocks = new HashMap<>();
        this.stocks=fetchStocksFromDB();
        if (stocks.size()>0)
        {this.isStockMarketOpen=true;}
    }

    public void addStock(Stock stock) throws SQLException, DBQueryExecutionException {
        if (!stocks.containsKey(stock.getStockName()))
        {
             stocks.put(stock.getStockName(),stock);
             addStocksToDB(stock);
        }
        else {
            int id=fetchStocksFromDBBasedonName(stock.getStockName().getName());
            stock.setId(id);
            updateStocksInDB(stock);
        }
    }

    public Map<StockName, Stock> getStocks() {
        return stocks;
    }

    public void setStocks(Map<StockName, Stock> stocks) {
        this.stocks = stocks;
    }

    public Boolean getStockMarketOpen() {
        return isStockMarketOpen;
    }

    public void setStockMarketOpen(Boolean status) {
        isStockMarketOpen = status;
    }

    public static StockMarket getStockMarket() {
        return stockMarket;
    }

    public static void setStockMarket(StockMarket stockMarket) {
        StockMarket.stockMarket = stockMarket;
    }

    public static double boughtPrice;

    public int quantity;


}
