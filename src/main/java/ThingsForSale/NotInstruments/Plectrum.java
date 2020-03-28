package ThingsForSale.NotInstruments;

import ThingsForSale.ISell;

public class Plectrum implements ISell {

    private String description;
    private String colour;
    private double purchasePrice;
    private double salePrice;

    public Plectrum(String description, String colour, double purchasePrice, double salePrice){
        this.description = description;
        this.colour = colour;
        this.purchasePrice = purchasePrice;
        this.salePrice = salePrice;
    }

    public String getDescription() {
        return description;
    }

    public String getColour() {
        return colour;
    }

    public double calculateMarkup(){
        return this.salePrice - this.purchasePrice;
    }
}
