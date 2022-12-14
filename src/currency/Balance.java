package currency;


import exceptions.BalanceInsufficientException;
import exceptions.CurrencyNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class Balance{

    private List<Currency> currencyList;


    private double walletValueinUSD;

    public Balance(double walletValueinUSD) {
        this.walletValueinUSD = walletValueinUSD;
        List<Currency> currencies=new ArrayList<>();
        currencies.add(new Currency("USD",0));
        this.currencyList=currencies;
    }

    public Balance() {
        this.walletValueinUSD = walletValueinUSD;
        List<Currency> currencies=new ArrayList<>();
        currencies.add(new Currency("USD",0));
        this.currencyList=currencies;
    }
    public List<Currency> getCurrencyList() {
        return currencyList;
    }

    public void setCurrencyList(List<Currency> currencyList) {
        this.currencyList = currencyList;
    }

    public double getWalletValueinUSD() {
        return walletValueinUSD;
    }



    public void addbalance(Currency currency)
    {
        for (Currency cur : currencyList ) {
            if (cur.getName().equals(currency.getName()))
            {
                cur.setQuantity(cur.getQuantity()+currency.getQuantity());
                return;
            }
        }
        setWalletValueinUSD();
        currencyList.add(currency);
    }

    public void substractbalance(Currency currency) throws BalanceInsufficientException, CurrencyNotFoundException {
        for (Currency cur : currencyList ) {
            if (cur.getName().equals(currency.getName()))
            {
                if (cur.getQuantity()>currency.getQuantity())
                {
                    cur.setQuantity(cur.getQuantity()-currency.getQuantity());

                    return;
                }
                else {
                    throw new BalanceInsufficientException("Insufficient Balance. You have only " + cur.getQuantity()+" "+cur.getSymbol()+"in balance");
                }

            }
        }
        throw new CurrencyNotFoundException("currency "+currency.getName() +" is not available with the user");

    }

    public List<String> getCurrencyNameList()
    {
        List<String> currencynames = new ArrayList<>();
        for (Currency cur : currencyList) {
            currencynames.add(cur.getName());
        }
        return currencynames;
    }


    public void setWalletValueinUSD() {
        double usdValue=0;
        if (currencyList!=null && currencyList.size()>0) {
            for (Currency cur : currencyList) {
                if (!cur.getName().equals("USD")) {
                    // convert currency
                    usdValue = cur.getQuantity();
                } else {
                    usdValue = cur.getQuantity();
                }
            }
            this.walletValueinUSD = usdValue;
        }
    }

}