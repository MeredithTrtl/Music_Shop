package NotInstruments;

import ThingsForSale.NotInstruments.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void before(){
        sheetMusic = new SheetMusic("The Planets - Gustav Holst", 5.67, 17.99);
    }

    @Test
    public void canGetDescription(){
        assertEquals("The Planets - Gustav Holst", sheetMusic.getDescription());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(12.32, sheetMusic.calculateMarkup(), 0.01);
    }
}
