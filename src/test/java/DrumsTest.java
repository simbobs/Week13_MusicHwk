import instruments.Drums;
import instruments.InstrumentCategoryType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class DrumsTest {

    Drums drums1;

    @Before
    public void before(){
        drums1 = new Drums(600, 900, InstrumentCategoryType.PERCUSSION, "Gretsch", 5, 3);

    }

    @Test
    public void canGetMarkup(){
        assertEquals(0.5, drums1.calculateMarkup(), 0.1);
    }

    @Test
    public void canPlay(){
        assertEquals("bang bang", drums1.play());
    }

}
