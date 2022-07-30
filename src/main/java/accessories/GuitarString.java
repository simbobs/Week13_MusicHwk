package accessories;

import behaviours.ISell;
import instruments.GuitarType;

public class GuitarString implements ISell {

    private String material;
    private boolean stringSet;
    private double buyPrice;
    private double sellPrice;
    private GuitarType guitarType;

    public GuitarString(String material, boolean stringSet, double buyPrice, double sellPrice, GuitarType guitarType) {
        this.material = material;
        this.stringSet = stringSet;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.guitarType = guitarType;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isStringSet() {
        return stringSet;
    }

    public void setStringSet(boolean stringSet) {
        this.stringSet = stringSet;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public GuitarType getGuitarType() {
        return guitarType;
    }

    public void setGuitarType(GuitarType guitarType) {
        this.guitarType = guitarType;
    }


    @Override
    public double calculateMarkup() {
        return (sellPrice - buyPrice) / buyPrice;
    }
}
