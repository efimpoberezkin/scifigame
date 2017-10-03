package character;

/**
 * Class for pairs of attributes and values.
 */
public class Stat {

    private Attribute attribute;
    private int value;

    public Stat(Attribute attribute, int value) {
        this.attribute = attribute;
        this.value = value;
    }

    public Attribute getAttribute() {
        return attribute;
    }

    public int getValue() {
        return value;
    }
    
}