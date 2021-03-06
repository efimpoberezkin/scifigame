package com.epam.homework.scifigame;

import com.epam.homework.scifigame.character.Attribute;
import com.epam.homework.scifigame.character.Character;
import com.epam.homework.scifigame.character.Stat;
import com.epam.homework.scifigame.items.Item;
import com.epam.homework.scifigame.items.KeyItem;
import com.epam.homework.scifigame.items.NonDisposable;
import com.epam.homework.scifigame.items.Note;
import com.epam.homework.scifigame.items.accessories.RingOfIntelligence;
import com.epam.homework.scifigame.items.armor.MercenaryGloves;
import com.epam.homework.scifigame.items.consumables.Antidote;
import com.epam.homework.scifigame.items.weapon.Lightsaber;
import com.epam.homework.scifigame.items.weapon.PlasmaRifle;

/**
 * Class with method main for initialization of items.
 */
public class ItemsInitializationAndTest {

    public static void main(String[] args) {

        KeyItem keyItem1 = new KeyItem("Mysterious key", "Use to open some door.");
        KeyItem keyItem2 = new KeyItem("Captain's pass", "Gives access to the command center.");
        Note note = new Note("Strange letter", "Letter tells about...", "Dear friend,...");
        RingOfIntelligence ring = new RingOfIntelligence();
        MercenaryGloves mercenaryGloves = new MercenaryGloves();
        Antidote antidote = new Antidote();
        PlasmaRifle plasmaRifle = new PlasmaRifle();
        Lightsaber blueLightsaber = new Lightsaber("blue");
        Lightsaber redLightsaber = new Lightsaber("red");

        Item[] areaItems = new Item[]{
                keyItem1,
                keyItem2,
                note,
                ring,
                mercenaryGloves,
                antidote,
                plasmaRifle,
                blueLightsaber,
                redLightsaber
        };

        for (Item item : areaItems) {
            System.out.println("Description of " + item.getName() + ": " + item.getDescription()
                    + (item instanceof NonDisposable ? "(Cannot be dropped)" : ""));
        }

        //Checking if certain character can use items from the list.

        Character character = new Character(
                "Playable character",
                29,
                new Stat[]{new Stat(Attribute.STRENGTH, 15),
                        new Stat(Attribute.AGILITY, 10),
                        new Stat(Attribute.INTELLIGENCE, 40)});

        for (Item item : areaItems) {
            System.out.println(character.getName()
                    + (character.canUse(item) ? " can use " : " cannot use ") + item.getName() + ".");
        }
    }

}