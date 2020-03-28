package ThingsForSale.NotInstruments;

import ThingsForSale.ISell;

public class Cable implements ISell {

    private String description;
    private double length;
    private double purchasePrice;
    private double salePrice;

    public Cable(String description, double length, double purchasePrice, double salePrice) {
        this.description = description;
        this.length = length;
        this.purchasePrice = purchasePrice;
        this.salePrice = salePrice;
    }

    public String getDescription() {
        return description;
    }

    public double getLength() {
        return length;
    }

    public double calculateMarkup(){
        return this.salePrice - this.purchasePrice;
    }
}
