package items.armor;

import character.AttributeRequirement;
import interaction.DefenseByDamageType;
import interaction.PassiveEffect;
import items.RegularItem;

/**
 * Superclass for final classes of armor, for example: MercenaryGloves, PilotVisor.
 */
public abstract class Armor extends RegularItem {

    private ArmorPart armorPart;
    private DefenseByDamageType[] defenseByDamageTypes;
    private int levelRequirement;
    private AttributeRequirement[] attributeRequirements;
    private PassiveEffect[] passiveEffects;

    public Armor(String name, String description, double weight, int value, ArmorPart armorPart,
                 DefenseByDamageType[] defenseByDamageTypes, int levelRequirement,
                 AttributeRequirement[] attributeRequirements, PassiveEffect[] passiveEffects) {
        super(name, description, weight, value);
        this.armorPart = armorPart;
        this.defenseByDamageTypes = defenseByDamageTypes;
        this.levelRequirement = levelRequirement;
        this.attributeRequirements = attributeRequirements;
        this.passiveEffects = passiveEffects;
    }

    public ArmorPart getArmorPart() {
        return armorPart;
    }

    public DefenseByDamageType[] getDefenseByDamageTypes() {
        return defenseByDamageTypes;
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