package com.epam.homework.scifigame.interaction;

/**
 * Class for sets of damage type, defense flat and percentage values.
 */
public class DefenseByDamageType {

    private DamageType damageType;
    private double flat;
    private double percent;

    public DefenseByDamageType(DamageType damageType, double flat, double percent) {
        this.damageType = damageType;
        this.flat = flat;
        this.percent = percent;
    }

    public DamageType getDamageType() {
        return damageType;
    }

    public double getFlat() {
        return flat;
    }

    public double getPercent() {
        return percent;
    }

}