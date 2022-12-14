package stocks.stockMarket;

import exceptions.DBQueryExecutionException;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import static persistence.DBQueryExecutor.executeDBInsertQuery;
import static persistence.DBQueryExecutor.searchDBWithQuery;

public class DBStockHelper {

    public static Map<StockName, Stock> fetchStocksFromDB() throws DBQueryExecutionException, SQLException {
        Map<StockName,Stock> response = new HashMap<>();
        String query = "select * from stocks";
        ResultSet results = searchDBWithQuery(query);
        while (results.next())
        {
            StockName stockName = new StockName(results.getString("name"),results.getString("symbol"));
            Stock stock = new Stock(stockName,results.getDouble("price"));
            response.put(stockName,stock);
        }
        return response;
    }

    public static void addStocksToDB(Stock stock) throws DBQueryExecutionException, SQLException {
        Map<StockName,Stock> response = new HashMap<>();
        String query = "INSERT INTO `stocks` ( `name`, `symbol`, `price`) VALUES('"+stock.getStockName().getName()+"','"+stock.getStockName().getSymbol()+"','"+stock.getPrice()+"')";
        executeDBInsertQuery(query);
        System.out.println("stock inserted into db");
    }

    public static void updateStocksInDB(Stock stock) throws DBQueryExecutionException, SQLException {
        Map<StockName,Stock> response = new HashMap<>();
        String query = "INSERT INTO `stocks` ( `id`,`name`, `symbol`, `price`) VALUES('"+stock.getStockName().getName()+"','"+stock.getStockName().getSymbol()+"','"+stock.getPrice()+"')";
        executeDBInsertQuery(query);
        System.out.println("stock inserted into db");
    }

    public static int fetchStocksFromDBBasedonName(String stockName) throws DBQueryExecutionException, SQLException {
        Map<StockName,Stock> response = new HashMap<>();
        String query = "select * from stocks where NAME='"+stockName+"';";
        ResultSet results = searchDBWithQuery(query);
        if (results.next())
        {
           return results.getInt("id");
        }
        return 0;
    }

}

