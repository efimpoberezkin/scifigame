package items.weapon;

import character.AttributeRequirement;
import interaction.DamageByType;
import interaction.PassiveEffect;

/**
 * Superclass for final classes of ranged weapons, for example: RocketLauncher, MachineGun, PlasmaRifle.
 */
public abstract class RangedWeapon extends Weapon {

    private AmmoType ammoType;
    private int ammoCapacity;
    private double range;
    private double reloadTime;
    private double fireRate;
    private double accuracy;
    private double recoil;

    public RangedWeapon(String name, String description, double weight, int value, DamageByType[] damageByTypes,
                        int levelRequirement, AttributeRequirement[] attributeRequirements,
                        PassiveEffect[] passiveEffects, AmmoType ammoType, int ammoCapacity, double range,
                        double reloadTime, double fireRate, double accuracy, double recoil) {
        super(name, description, weight, value, damageByTypes, levelRequirement, attributeRequirements, passiveEffects);
        this.ammoType = ammoType;
        this.ammoCapacity = ammoCapacity;
        this.range = range;
        this.reloadTime = reloadTime;
        this.fireRate = fireRate;
        this.accuracy = accuracy;
        this.recoil = recoil;
    }

    public AmmoType getAmmoType() {
        return ammoType;
    }

    public int getAmmoCapacity() {
        return ammoCapacity;
    }

    public double getRange() {
        return range;
    }

    public double getReloadTime() {
        return reloadTime;
    }

    public double getFireRate() {
        return fireRate;
    }

    public double getAccuracy() {
        return accuracy;
    }

    public double getRecoil() {
        return recoil;
    }

}