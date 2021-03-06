package com.epam.homework.scifigame.items.armor;

import com.epam.homework.scifigame.character.Attribute;
import com.epam.homework.scifigame.character.AttributeRequirement;
import com.epam.homework.scifigame.interaction.DamageType;
import com.epam.homework.scifigame.interaction.DefenseByDamageType;

public final class MercenaryGloves extends Armor {

    public MercenaryGloves() {
        super("Mercenary Gloves",
                "Gloves of a nameless mercenary.",
                1.5,
                50,
                ArmorPart.ARMS,
                new DefenseByDamageType[]{new DefenseByDamageType(DamageType.PHYSICAL, 10, 0.2)},
                10,
                new AttributeRequirement[]{new AttributeRequirement(Attribute.AGILITY, 5)},
                null);
    }
}