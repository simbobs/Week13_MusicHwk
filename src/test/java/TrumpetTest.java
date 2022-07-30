import instruments.InstrumentCategoryType;
import instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void before(){
        trumpet = new Trumpet(450, 670, InstrumentCategoryType.BRASS, "Bach","brass", true);
    }

    @Test
    public void canPlay(){
        assertEquals("brrrr brrr brrrr", trumpet.play());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(0.48, trumpet.calculateMarkup(), 0.1);
    }
}
