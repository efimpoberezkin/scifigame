import character.Attribute;
import character.Character;
import character.Stat;
import items.Item;
import items.KeyItem;
import items.NonDisposable;
import items.Note;
import items.accessories.RingOfIntelligence;
import items.armor.MercenaryGloves;
import items.consumables.Antidote;
import items.weapon.Lightsaber;
import items.weapon.PlasmaRifle;

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
    }

}