package ThingsForSale.NotInstruments;
import ThingsForSale.ISell;

public class SheetMusic implements ISell{

    private String description;
    private double purchasePrice;
    private double salePrice;

    public SheetMusic(String description, double purchasePrice, double salePrice){
        this.description = description;
        this.purchasePrice = purchasePrice;
        this.salePrice = salePrice;
    }

    public String getDescription() {
        return description;
    }

    public double calculateMarkup(){
        return this.salePrice - this.purchasePrice;
    }
}
