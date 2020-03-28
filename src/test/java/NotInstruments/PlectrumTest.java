package NotInstruments;

import ThingsForSale.NotInstruments.Plectrum;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlectrumTest {

    Plectrum plectrum;

    @Before
    public void before(){
        plectrum = new Plectrum("A plectrum.", "Cool & edgy skull design.", 0.11, 1.00);
    }

    @Test
    public void canGetDescription(){
        assertEquals("A plectrum.", plectrum.getDescription());
    }

    @Test
    public void canGetColour(){
        assertEquals("Cool & edgy skull design.", plectrum.getColour());
    }

    @Test
    public void canGetMarkup(){
        assertEquals(0.89, plectrum.calculateMarkup(), 0.01);
    }
}

