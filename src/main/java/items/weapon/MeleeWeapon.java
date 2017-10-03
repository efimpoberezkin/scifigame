package items.weapon;

import character.AttributeRequirement;
import interaction.DamageByType;
import interaction.PassiveEffect;

/**
 * Superclass for final classes of melee weapons, for example: Katana, Lightsaber.
 */
public abstract class MeleeWeapon extends Weapon {

    public MeleeWeapon(String name, String description, double weight, int value, DamageByType[] damageByTypes,
                       int levelRequirement, AttributeRequirement[] attributeRequirements,
                       PassiveEffect[] passiveEffects) {
        super(name, description, weight, value, damageByTypes, levelRequirement, attributeRequirements, passiveEffects);
    }

}