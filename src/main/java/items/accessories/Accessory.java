package items.accessories;

import interaction.PassiveEffect;
import items.RegularItem;

/**
 * Superclass for final classes of accessories, for example: ring of intelligence.
 */
public abstract class Accessory extends RegularItem {

    private PassiveEffect[] passiveEffects;

    public Accessory(String name, String description, double weight, int value, PassiveEffect[] passiveEffects) {
        super(name, description, weight, value);
        this.passiveEffects = passiveEffects;
    }

    public PassiveEffect[] getPassiveEffects() {
        return passiveEffects;
    }

}