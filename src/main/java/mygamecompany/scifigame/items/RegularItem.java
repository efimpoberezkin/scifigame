package mygamecompany.scifigame.items;

/**
 * Superclass for classes of regular items that can be traded and dropped by a player.
 */
public abstract class RegularItem extends Item {

    private double weight;
    private int value; //base price

    public RegularItem(String name, String description, double weight, int value) {
        super(name, description);
        this.weight = weight;
        this.value = value;
    }

    public double getWeight() {
        return weight;
    }

    public int getValue() {
        return value;
    }

}