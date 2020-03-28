package ThingsForSale.Instruments;

public class Guitar extends Instrument implements IPlay {

    public int numberOfStrings;

    public Guitar(int numberOfStrings, String material, String colour, Types type, double purchasePrice, double salePrice){
        super(material, colour, type, purchasePrice, salePrice);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String play(){
        return "Twang...";
    }
}
