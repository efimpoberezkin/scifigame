package character;

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

}