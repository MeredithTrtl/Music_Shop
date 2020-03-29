import ThingsForSale.Instruments.*;
import ThingsForSale.NotInstruments.Cable;
import ThingsForSale.NotInstruments.Plectrum;
import ThingsForSale.NotInstruments.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Cat cat;
    Shop shop;
    Cable cable;
    Plectrum plectrum;
    SheetMusic sheetMusic;
    Guitar guitar;
    Oboe oboe;
    Piano piano;
    Trumpet trumpet;

    @Before
    public void before(){
        cat = new Cat ("Mr Whiskers", "orange");
        shop = new Shop (cat);
        cable = new Cable ("Piano to Tambourine cable.", 1.67, 2.99, 9.99);
        plectrum = new Plectrum("A plectrum.", "Cool & edgy skull design.", 0.11, 1.00);
        sheetMusic = new SheetMusic("The Planets - Gustav Holst", 5.67, 17.99);
        guitar = new Guitar(6, "wood", "red", Types.STRING, 89.99, 199.99);
        oboe = new Oboe(2, "wood", "black", Types.WOODWIND, 87.42, 150.00);
        piano = new Piano(88, "hard maple", "dark brown", Types.STRING, 636.99, 840.00);
        trumpet = new Trumpet(4, "brass", "gold", Types.BRASS, 34.44, 89.99);
    }

    @Test
    public void shopHasCat(){
        assertEquals("Mr Whiskers", shop.getCat().getName());
    }

    @Test
    public void stockStartsEmpty(){
        assertEquals(0, shop.getStockCount());
    }

    @Test
    public void canAddToStock(){
        shop.addToStock(cable);
        shop.addToStock(plectrum);
        shop.addToStock(sheetMusic);
        shop.addToStock(guitar);
        shop.addToStock(oboe);
        shop.addToStock(piano);
        shop.addToStock(trumpet);
        assertEquals(7, shop.getStockCount());
    }

    @Test
    public void canRemoveFromStock(){
        shop.addToStock(cable);
        shop.addToStock(plectrum);
        shop.addToStock(sheetMusic);
        shop.addToStock(guitar);
        shop.addToStock(oboe);
        shop.addToStock(piano);
        shop.addToStock(trumpet);
        shop.removeFromStock(trumpet);
        shop.removeFromStock(sheetMusic);
        assertEquals(5, shop.getStockCount());
    }

    @Test
    public void canGetTotalProfit(){
        shop.addToStock(cable);
        shop.addToStock(plectrum);
        shop.addToStock(sheetMusic);
        shop.addToStock(guitar);
        shop.addToStock(oboe);
        shop.addToStock(piano);
        shop.addToStock(trumpet);
        assertEquals(451.35, shop.totalPotentialProfit(), 0.01);
    }

}



