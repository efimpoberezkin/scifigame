package items.accessories;

import interaction.PassiveEffect;

/**
 * Final class for Ring of Intelligence objects.
 */
public final class RingOfIntelligence extends Accessory {

    public RingOfIntelligence() {
        super("Ring of Intelligence",
                "Ring that increases Intelligence.",
                0.5,
                30,
                new PassiveEffect[]{new PassiveEffect("Intelligence increase")});
    }

}