package stocks.stockMarket;

public class Stock {

    private int id;
    private StockName stockName;
    private double price;

    public Stock(StockName stockName, double price) {
        this.stockName = stockName;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public StockName getStockName() {
        return stockName;
    }

    public void setStockName(StockName stockName) {
        this.stockName = stockName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
