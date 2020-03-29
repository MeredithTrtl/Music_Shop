package Instruments;

import ThingsForSale.Instruments.Piano;
import ThingsForSale.Instruments.Types;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano(88, "hard maple", "dark brown", Types.STRING, 636.99, 840.00);
    }

    @Test
    public void canGetNumberOfKeys(){
        assertEquals(88, piano.getKeys());
    }

    @Test
    public void canGetMaterial(){
        assertEquals("hard maple", piano.getMaterial());
    }

    @Test
    public void canGetColour(){
        assertEquals("dark brown", piano.getColour());
    }

    @Test
    public void canGetType(){
        assertEquals(Types.STRING, piano.getType());
    }

    @Test
    public void canPlayPiano(){
        assertEquals("Plink Plonk Plink...", piano.play());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(203.01, piano.calculateMarkup(), 0.01);
    }
}
