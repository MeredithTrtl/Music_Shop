package Instruments;

import ThingsForSale.Instruments.Oboe;
import ThingsForSale.Instruments.Types;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OboeTest {

    Oboe oboe;

    @Before
    public void before(){
        oboe = new Oboe(2, "wood", "black", Types.WOODWIND, 87.42, 150.00);
    }


    @Test
    public void canGetNumberOfReeds(){
        assertEquals(2, oboe.getReeds());
    }

    @Test
    public void canGetMaterial(){
        assertEquals("wood", oboe.getMaterial());
    }

    @Test
    public void canGetColour(){
        assertEquals("black", oboe.getColour());
    }

    @Test
    public void canGetType(){
        assertEquals(Types.WOODWIND, oboe.getType());
    }

    @Test
    public void canPlayOboe(){
        assertEquals("Woooo...", oboe.play());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(62.58, oboe.calculateMarkup(), 0.01);
    }

}
