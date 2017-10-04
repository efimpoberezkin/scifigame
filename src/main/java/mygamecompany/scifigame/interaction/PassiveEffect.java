package mygamecompany.scifigame.interaction;

/**
 * Class for various passive effects, for example: stat increase, permanent debuff.
 */
public class PassiveEffect {

    private String name;

    public PassiveEffect(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}