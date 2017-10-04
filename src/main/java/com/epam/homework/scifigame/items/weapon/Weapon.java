package com.epam.homework.scifigame.items.weapon;

import com.epam.homework.scifigame.character.AttributeRequirement;
import com.epam.homework.scifigame.items.HasRequirements;
import com.epam.homework.scifigame.items.RegularItem;
import com.epam.homework.scifigame.interaction.DamageByType;
import com.epam.homework.scifigame.interaction.PassiveEffect;

/**
 * Superclass for different kinds of weapon classes.
 */
public abstract class Weapon extends RegularItem implements HasRequirements {

    private DamageByType[] damageByTypes;
    private int levelRequirement;
    private AttributeRequirement[] attributeRequirements;
    private PassiveEffect[] passiveEffects;

    public Weapon(String name, String description, double weight, int value, DamageByType[] damageByTypes,
                  int levelRequirement, AttributeRequirement[] attributeRequirements, PassiveEffect[] passiveEffects) {
        super(name, description, weight, value);
        this.damageByTypes = damageByTypes;
        this.levelRequirement = levelRequirement;
        this.attributeRequirements = attributeRequirements;
        this.passiveEffects = passiveEffects;
    }

    public DamageByType[] getDamageByTypes() {
        return damageByTypes;
    }

    public int getLevelRequirement() {
        return levelRequirement;
    }

    public AttributeRequirement[] getAttributeRequirements() {
        return attributeRequirements;
    }

    public PassiveEffect[] getPassiveEffects() {
        return passiveEffects;
    }

}