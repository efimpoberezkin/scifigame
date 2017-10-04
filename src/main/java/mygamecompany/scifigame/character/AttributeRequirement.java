package mygamecompany.scifigame.character;

/**
 * Class for pairs of attributes and requirements.
 */
public class AttributeRequirement {

    private Attribute attribute;
    private int value;

    public AttributeRequirement(Attribute attribute, int value) {
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