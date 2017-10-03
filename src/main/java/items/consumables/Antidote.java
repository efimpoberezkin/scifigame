package items.consumables;

import interaction.Effect;

/**
 * Final class for Antidote objects.
 */
public final class Antidote extends Consumable {

    public Antidote() {
        super("Antidote",
                "Cures poison.",
                1.0,
                10,
                new Effect[]{new Effect("Remove poison")});
    }

}