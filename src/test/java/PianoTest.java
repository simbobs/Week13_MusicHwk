import instruments.InstrumentCategoryType;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano(1100, 1600, InstrumentCategoryType.PERCUSSION, "Yamaha", "digital", 88);

    }

    @Test
    public void canPlay(){
        assertEquals("play me a song pianoman", piano.play());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(0.45, piano.calculateMarkup(), 0.1);
    }
}
