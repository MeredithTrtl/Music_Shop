package NotInstruments;

import ThingsForSale.NotInstruments.Cable;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CableTest {

    Cable cable;

    @Before
    public void before(){
        cable = new Cable("Piano to Tambourine cable.", 1.67, 2.99, 9.99);
    }

    @Test
    public void canGetDescription(){
        assertEquals("Piano to Tambourine cable.", cable.getDescription());
    }

    @Test
    public void canGetLength(){
        assertEquals(1.67, cable.getLength(), 0.01);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(7.00, cable.calculateMarkup(), 0.01);
    }
}

