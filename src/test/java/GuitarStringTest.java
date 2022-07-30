import accessories.GuitarString;
import instruments.GuitarType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringTest {

    GuitarString guitarString;

    @Before
        public void before(){
        guitarString = new GuitarString("steel", false, 1, 3, GuitarType.ACOUSTIC);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(2, guitarString.calculateMarkup(), 0.1);
    }

}
