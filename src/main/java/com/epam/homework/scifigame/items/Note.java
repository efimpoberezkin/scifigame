package com.epam.homework.scifigame.items;

/**
 * Class for different kind of notes picked up by a player.
 */
public class Note extends Item implements NonDisposable {

    private String text;

    public Note(String name, String description, String text) {
        super(name, description);
        this.text = text;
    }

    public String getText() {
        return text;
    }

}