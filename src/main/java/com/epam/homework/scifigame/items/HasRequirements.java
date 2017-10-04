package com.epam.homework.scifigame.items;

import com.epam.homework.scifigame.character.AttributeRequirement;

/**
 * Interface for item classes that have requirements.
 */
public interface HasRequirements {

    public AttributeRequirement[] getAttributeRequirements();
    public int getLevelRequirement();

}
