package items;

import character.AttributeRequirement;

/**
 * Interface for item classes that have requirements.
 */
public interface HasRequirements {

    public AttributeRequirement[] getAttributeRequirements();
    public int getLevelRequirement();

}
