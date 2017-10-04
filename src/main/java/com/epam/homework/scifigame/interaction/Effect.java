package com.epam.homework.scifigame.interaction;

/**
 * Class for various effects, for example: healing, buffing.
 */
public class Effect {

    private String name;

    public Effect(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}