package com.epam.homework.scifigame.interaction;

/**
 * Class for damage type and damage value pairs.
 */
public class DamageByType {

    private DamageType damageType;
    private double value;

    public DamageByType(DamageType damageType, double value) {
        this.damageType = damageType;
        this.value = value;
    }

    public DamageType getDamageType() {
        return damageType;
    }

    public double getValue() {
        return value;
    }

}