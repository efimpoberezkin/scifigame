package mygamecompany.scifigame.items;

import mygamecompany.scifigame.character.AttributeRequirement;

/**
 * Interface for item classes that have requirements.
 */
public interface HasRequirements {

    public AttributeRequirement[] getAttributeRequirements();
    public int getLevelRequirement();

}
