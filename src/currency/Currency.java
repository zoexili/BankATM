package currency;

public class Currency{
   private String name;
   private String symbol;
   private double quantity;

    public Currency(String name, String symbol, double quantity) {
        this.name = name;
        this.symbol = symbol;
        this.quantity = quantity;
    }
    public Currency(String name, double quantity) {
        this.name = name;
        this.symbol = null;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Currency{" +
                "name='" + name + '\'' +
                ", symbol='" + symbol + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}


