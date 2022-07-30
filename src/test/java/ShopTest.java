import accessories.GuitarString;
import behaviours.ISell;
import instruments.Guitar;
import instruments.GuitarType;
import instruments.Harp;
import instruments.InstrumentCategoryType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class ShopTest {

    Guitar guitar;
    Harp harp;
    GuitarString guitarString;

    ArrayList<ISell> stockList;

    Shop shop;


    @Before
    public void before(){
        guitar = new Guitar(70, 110, InstrumentCategoryType.STRINGS, "Fender", GuitarType.ACOUSTIC, "wood", 6);
        harp = new Harp(500, 950, InstrumentCategoryType.STRINGS, "Blondie", 150, 36);
        guitarString = new GuitarString("steel", false, 1, 3, GuitarType.ACOUSTIC);
        stockList= new ArrayList<>();
        stockList.add(guitar);
        stockList.add(harp);
        shop = new Shop("AlphaBeat", stockList);

    }

    @Test
    public void canAddStock(){
        shop.addStock(guitarString);
        assertEquals(3, shop.getStockList().size());
    }

    @Test
    public void canRemoveStock(){
        shop.removeStock(harp);
        assertFalse(shop.getStockList().contains(harp));
        assertEquals(1, shop.getStockList().size());

    }
}
