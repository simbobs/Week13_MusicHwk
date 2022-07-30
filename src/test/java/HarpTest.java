import instruments.Harp;
import instruments.InstrumentCategoryType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HarpTest {

    Harp harp;

    @Before
    public void before() {

        harp = new Harp(500, 950, InstrumentCategoryType.STRINGS, "Blondie", 150, 36);

    }

    @Test
    public void canPlay(){
        assertEquals("gentle, dreamy music plays", harp.play());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(0.9, harp.calculateMarkup(), 0.1);
    }


}
