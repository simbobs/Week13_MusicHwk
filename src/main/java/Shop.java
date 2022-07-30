import accessories.GuitarString;
import behaviours.ISell;
import instruments.Harp;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISell> stockList;

    public Shop(String name, ArrayList<ISell> stockList) {
        this.name = name;
        this.stockList = stockList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<ISell> getStockList() {
        return stockList;
    }

    public void setStockList(ArrayList<ISell> stockList) {
        this.stockList = stockList;
    }

    public void addStock(ISell item) {
        stockList.add(item);
    }

    public void removeStock(ISell item) {
        stockList.remove(item);
    }
}
