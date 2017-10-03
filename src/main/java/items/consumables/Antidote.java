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
                //TODO: Class Effect should be abstract, this would be an array of its subclasses' objects.
                new Effect[]{new Effect("Remove poison")});
    }

}