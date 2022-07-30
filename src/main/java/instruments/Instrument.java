package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public abstract class Instrument implements IPlay, ISell {

    private double buyPrice;
    private double sellPrice;
    private InstrumentCategoryType section;
    private String brand;



    public Instrument(double buyPrice, double sellPrice, InstrumentCategoryType section, String brand) {
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.section = section;
        this.brand = brand;
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

    public InstrumentCategoryType getSection() {
        return section;
    }

    public void setSection(InstrumentCategoryType section) {
        this.section = section;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }



}
