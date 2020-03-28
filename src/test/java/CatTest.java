import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CatTest {

    Cat cat;

    @Before
    public void before(){
        cat = new Cat("Catty", "tabby");
    }

    @Test
    public void catHasName(){
        assertEquals("Catty", cat.getName());
    }

    @Test
    public void catHasColour(){
        assertEquals("tabby", cat.getColour());
    }
}
