package heroes;

/**
 * The Hero class.
 *
 * @author OliveGarch
 */
public class Hero {
    // fields

    private int hitPoints;
    private final int maxHitPoints;
    private final String name;

    private static int DAMAGE_AMOUNT = 15;

    // constructor

    /**
     * THe constructor class for Hero
     * @param name the name of the Hero
     * @param hitPoints the hit points of the Hero
     */
    public Hero(String name, int hitPoints) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.maxHitPoints = hitPoints;
    }

    // methods

    /**
     * The hero takes damage
     *
     * prints damage message
     * the damage dealt is subtracted from their current hit points
     * check if hit points < 0, if true assign 0
     * @param amount the damage taken
     */
    public void takeDamage(int amount) {
        System.out.println(name + " takes " + amount + " damage ");
        System.out.println(name + " takes " + amount + " damage");
        this.hitPoints -= amount;
        if (hitPoints < 0){
            hitPoints = 0;
        }
    }

    public void attack(Hero enemy) {
        enemy.takeDamage(DAMAGE_AMOUNT);
    }

    /**
     * Checks if the hero has fallen
     *
     * prints fallen message
     * checks if the hero's hit points are 0
     * @return true if the hero's hit points are 0, false otherwise.
     */
    public boolean hasFallen() {
        return (hitPoints == 0);
    }

    /**
     * Returns the name of the hero
     * @return The name of the hero as a string
     */
    public String getName(){
        return this.name;
    }

    /**
     * Heals the hero by a given amount
     *
     * prints heal message
     * changes the hero's hit points by the amount healed,
     * check if above max HP. if true, assign max HP
     * @param amount The amount the hero heals
     */
    public void heal(int amount){
        System.out.println(name + " heals " + amount + " points");
        this.hitPoints += amount;
        if (hitPoints > maxHitPoints) {
            hitPoints = maxHitPoints;
        }
    }

    /**
     * Returns the hit points of the hero
     * @return current hit points of the hero
     */
    public int getHitPoints() {
        return hitPoints;
    }

    /**
     * Returns a string of the hero in the following format:
     * Name, ROLE, currentHP/maxHP
     * @return The string containing the hero's information
     */
    public String toString(){
        return this.name + ", " +
                this.hitPoints + "/" + this.maxHitPoints;
    }
}
