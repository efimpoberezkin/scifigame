package com.epam.homework.scifigame.items.weapon;

import com.epam.homework.scifigame.character.Attribute;
import com.epam.homework.scifigame.character.AttributeRequirement;
import com.epam.homework.scifigame.interaction.DamageByType;
import com.epam.homework.scifigame.interaction.DamageType;

/**
 * Final class for PlasmaRifle objects.
 */
public final class PlasmaRifle extends RangedWeapon {

    public PlasmaRifle() {
        super("Plasma Rifle",
                "Old plasma rifle.",
                8.5,
                200,
                new DamageByType[]{new DamageByType(DamageType.PLASMA, 50)},
                30,
                new AttributeRequirement[]{new AttributeRequirement(Attribute.STRENGTH, 15)},
                null,
                AmmoType.PLASMA_RIFLE_AMMO,
                100,
                200,
                1.5,
                3,
                0.8,
                0.1);
    }

}