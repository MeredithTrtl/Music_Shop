package ThingsForSale.Instruments;

public class Piano extends Instrument implements IPlay{

    private int keys;

    public Piano(int keys, String material, String colour, Types type, double purchasePrice, double salePrice){
        super(material, colour, type, purchasePrice, salePrice);
        this.keys = keys;
    }

    public int getKeys() {
        return keys;
    }

    public String play(){
        return "Plink Plonk Plink...";
    }
}
