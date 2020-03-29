package ThingsForSale.Instruments;

public class Trumpet extends Instrument implements IPlay {

    private int valves;

    public Trumpet(int valves, String material, String colour, Types type, double purchasePrice, double salePrice){
        super(material, colour, type, purchasePrice, salePrice);
        this.valves = valves;
    }

    public int getValves() {
        return valves;
    }

    public String play(){
        return "Trumpety trumpet sound...";
    }
}
