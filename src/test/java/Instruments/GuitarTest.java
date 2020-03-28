package Instruments;

import ThingsForSale.Instruments.Guitar;
import ThingsForSale.Instruments.Types;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar(6, "wood", "red", Types.STRING, 89.99, 199.99);
    }

    @Test
    public void canGetNumberOfStrings(){
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void canGetMaterial(){
        assertEquals("wood", guitar.getMaterial());
    }

    @Test
    public void canGetColour(){
        assertEquals("red", guitar.getColour());
    }

    @Test
    public void canGetType(){
        assertEquals(Types.STRING, guitar.getType());
    }

    @Test
    public void canPlayGuitar(){
        assertEquals("Twang...", guitar.play());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(110.00, guitar.calculateMarkup(), 0.01);
    }
}
