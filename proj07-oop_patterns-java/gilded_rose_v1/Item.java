package gilded_rose_v1;


public abstract class Item {

    protected static final int MINIMUM_QUALITY = 0;
    protected static final int MAXIMUM_QUALITY = 50;

    protected String description;
    protected int sellIn;
    protected int quality;


    protected Item() {
    }

    protected Item(String description, int sellIn, int quality) {
        this.description = description;
        this.sellIn = sellIn;
        this.quality = quality;
    }


    public String getDescription() {
        return description;
    }

    public int getSellIn() {
        return sellIn;
    }

    public int getQuality() {
        return quality;
    }

    public void update() {
        if (quality > 1) {
            if (sellIn > 0) {
                quality -= 1;
            }
            else {
                quality -= 2;
            }
        }
        else if (quality == 1) {
            quality = MINIMUM_QUALITY;
        }
        sellIn -= 1;
    }

    @Override
    public String toString() {
        return this.description + ", " + this.sellIn + ", " + this.quality;
    }

}
