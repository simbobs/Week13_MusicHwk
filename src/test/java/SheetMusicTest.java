import accessories.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void before(){
        sheetMusic = new SheetMusic("La vie en Rose", "Édith Piaf", 2, 4, "Piano");
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(1, sheetMusic.calculateMarkup(), 0.1);

    }
}
