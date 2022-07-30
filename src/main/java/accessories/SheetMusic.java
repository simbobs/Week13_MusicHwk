package accessories;

import behaviours.ISell;

public class SheetMusic implements ISell {

    private String songName;
    private String composer;
    private double buyPrice;
    private double sellPrice;
    private String instrument;

    public SheetMusic(String songName, String composer, double buyPrice, double sellPrice, String instrument) {
        this.songName = songName;
        this.composer = composer;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.instrument = instrument;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getComposer() {
        return composer;
    }

    public void setComposer(String composer) {
        this.composer = composer;
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

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    @Override
    public double calculateMarkup() {
        return (sellPrice - buyPrice) / buyPrice;
    }
}
