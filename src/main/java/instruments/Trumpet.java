package instruments;

public class Trumpet extends Instrument{
    private String material;
    private boolean caseIncluded;

    public Trumpet(double buyPrice, double sellPrice, InstrumentCategoryType section, String brand, String material, boolean caseIncluded) {
        super(buyPrice, sellPrice, section, brand);
        this.material = material;
        this.caseIncluded = caseIncluded;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isCaseIncluded() {
        return caseIncluded;
    }

    public void setCaseIncluded(boolean caseIncluded) {
        this.caseIncluded = caseIncluded;
    }

    @Override
    public String play() {
        return "brrrr brrr brrrr";
    }

    @Override
    public double calculateMarkup() {
        return (this.getSellPrice() - this.getBuyPrice()) / this.getBuyPrice();
    }
}
