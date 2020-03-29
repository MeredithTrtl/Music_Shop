package ThingsForSale.Instruments;

public class Oboe extends Instrument implements IPlay{

    private int reeds;

    public Oboe(int reeds, String material, String colour, Types type, double purchasePrice, double salePrice){
        super(material, colour, type, purchasePrice, salePrice);
        this.reeds = reeds;
    }

    public int getReeds() {
        return reeds;
    }

    public String play(){
        return "Woooo...";
    }
}
