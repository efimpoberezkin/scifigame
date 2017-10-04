package com.epam.homework.scifigame.items.weapon;

import com.epam.homework.scifigame.character.Attribute;
import com.epam.homework.scifigame.character.AttributeRequirement;
import com.epam.homework.scifigame.interaction.DamageByType;
import com.epam.homework.scifigame.interaction.DamageType;

/**
 * Final class for Lightsaber objects.
 */
public final class Lightsaber extends MeleeWeapon {

    private String color;

    public Lightsaber(String color) {
        super("Lightsaber",
                "A powerful weapon from a long forgotten time.",
                4.0,
                1000,
                new DamageByType[]{new DamageByType(DamageType.LASER, 200)},
                100,
                new AttributeRequirement[]{new AttributeRequirement(Attribute.STRENGTH, 20),
                        new AttributeRequirement(Attribute.AGILITY, 40),
                        new AttributeRequirement(Attribute.INTELLIGENCE, 40)},
                null);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

}