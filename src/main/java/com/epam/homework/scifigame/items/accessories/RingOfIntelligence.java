package com.epam.homework.scifigame.items.accessories;

import com.epam.homework.scifigame.interaction.PassiveEffect;

/**
 * Final class for Ring of Intelligence objects.
 */
public final class RingOfIntelligence extends Accessory {

    public RingOfIntelligence() {
        super("Ring of Intelligence",
                "Ring that increases Intelligence.",
                0.5,
                30,
                //TODO: Class PassiveEffect should be abstract, this would be an array of its subclasses' objects.
                new PassiveEffect[]{new PassiveEffect("Intelligence increase")});
    }

}