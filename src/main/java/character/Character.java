package character;

public class Character {

    private String name;
    private Stat[] stats;

    public Character(String name, Stat[] stats) {
        this.name = name;
        this.stats = stats;
    }

    public String getName() {
        return name;
    }

    public Stat[] getStats() {
        return stats;
    }
    
}