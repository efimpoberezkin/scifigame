package com.epam.homework.scifigame.items.consumables;

import com.epam.homework.scifigame.interaction.Effect;
import com.epam.homework.scifigame.items.RegularItem;

/**
 * Superclass for final classes of consumables, for example: Antidote.
 */
public abstract class Consumable extends RegularItem {

    private Effect[] effects;

    public Consumable(String name, String description, double weight, int value, Effect[] effects) {
        super(name, description, weight, value);
        this.effects = effects;
    }

    public Effect[] getEffects() {
        return effects;
    }

}