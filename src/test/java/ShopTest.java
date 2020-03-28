import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Cat cat;
    Shop shop;

    @Before
    public void before(){
        cat = new Cat ("Mr Whiskers", "orange");
        shop = new Shop (cat);
    }

    @Test
    public void shopHasCat(){
        assertEquals("Mr Whiskers", shop.getCat().getName());
    }
}
