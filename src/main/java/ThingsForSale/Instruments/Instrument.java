package ThingsForSale.Instruments;

import ThingsForSale.ISell;

public abstract class Instrument implements ISell {

    private String material;
    private String colour;
    private Types type;
    private double purchasePrice;
    private double salePrice;

    public Instrument(String material, String colour, Types type, double purchasePrice, double salePrice) {
        this.material = material;
        this.colour = colour;
        this.type = type;
        this.purchasePrice = purchasePrice;
        this.salePrice = salePrice;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public Types getType() {
        return type;
    }

    public double calculateMarkup(){
        return this.salePrice - this.purchasePrice;
    }
}
