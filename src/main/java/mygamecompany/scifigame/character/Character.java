package mygamecompany.scifigame.character;

import mygamecompany.scifigame.items.HasRequirements;
import mygamecompany.scifigame.items.Item;

public class Character {

    private String name;
    private int level;
    private Stat[] stats;

    public Character(String name, int level, Stat[] stats) {
        this.name = name;
        this.level = level;
        this.stats = stats;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Stat[] getStats() {
        return stats;
    }

    public void setStats(Stat[] stats) {
        this.stats = stats;
    }

    public boolean canUse(Item item) {
        if (item instanceof HasRequirements) {
            HasRequirements itemWithRequirements = (HasRequirements) item;
            if (this.level < itemWithRequirements.getLevelRequirement()) {
                return false;
            } else {

                AttributeRequirement[] requiredAttributes = itemWithRequirements.getAttributeRequirements();
                for (AttributeRequirement attributeRequirement : requiredAttributes) {

                    Stat accordingStat = null;
                    for (Stat stat : this.stats) {
                        if (stat.getAttribute() == attributeRequirement.getAttribute()) {
                            accordingStat = stat;
                            break;
                        }
                    }

                    if (accordingStat == null) {
                        return false;
                    } else {
                        if (accordingStat.getValue() < attributeRequirement.getValue()) {
                            return false;
                        }
                    }
                }

                return true;
            }
        } else {
            return true;
        }
    }

}