import instruments.Guitar;
import instruments.GuitarType;
import instruments.InstrumentCategoryType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar(70, 110, InstrumentCategoryType.STRINGS, "Fender", GuitarType.ACOUSTIC, "wood", 6);

    }

    @Test
    public void canPlay(){
        assertEquals("strum them strings", guitar.play());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(0.57, guitar.calculateMarkup(), 0.1);
    }
}
