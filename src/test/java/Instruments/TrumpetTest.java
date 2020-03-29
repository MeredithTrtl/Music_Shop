package Instruments;

import ThingsForSale.Instruments.Trumpet;
import ThingsForSale.Instruments.Types;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void before(){
        trumpet = new Trumpet(4, "brass", "gold", Types.BRASS, 34.44, 89.99);
    }

    @Test
    public void canGetNumberOfValves(){
        assertEquals(4, trumpet.getValves());
    }

    @Test
    public void canGetMaterial(){
        assertEquals("brass", trumpet.getMaterial());
    }

    @Test
    public void canGetColour(){
        assertEquals("gold", trumpet.getColour());
    }

    @Test
    public void canGetType(){
        assertEquals(Types.BRASS, trumpet.getType());
    }

    @Test
    public void canPlayTrumpet(){
        assertEquals("Trumpety trumpet sound...", trumpet.play());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(55.55, trumpet.calculateMarkup(), 0.01);
    }
}
