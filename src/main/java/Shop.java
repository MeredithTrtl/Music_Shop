import ThingsForSale.ISell;

import java.util.ArrayList;

public class Shop {

    private Cat cat;
    private ArrayList<ISell> stock;

    public Shop(Cat cat){
        this.cat = cat;
        stock = new ArrayList<ISell>();
    }

    public Cat getCat() {
        return cat;
    }

    public int getStockCount(){
        return stock.size();
    }

    public void addToStock(ISell item){
        stock.add(item);
    }

    public void removeFromStock(ISell item){
        stock.remove(item);
    }

    public double totalPotentialProfit(){
        double profit = 0;
        for (ISell item: stock){
            profit += item.calculateMarkup();
        }
        return profit;
    }
}
