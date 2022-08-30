package heroes;

import java.util.Scanner;

/**
 * The Hero class.
 *
 * Like Sekrio:
 * hitpoints are posture
 * hearts are death markers
 *
 * @author OliveGarch
 */
public class Hero {
    // fields

    private int hitPoints;
    private final int maxHitPoints;
    private int hearts;
    private final int maxHearts;
    private final String name;

    private int damage;
    private int agility;

    // constructor

    /**
     * THe constructor class for Hero
     * @param name the name of the Hero
     * @param hitPoints the posture hit points of the Hero
     * @param hearts the hearts of life of the Hero
     */
    public Hero(String name, int hitPoints, int hearts, int damage, int agility) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.maxHitPoints = hitPoints;
        this.hearts = hearts;
        this.maxHearts = hearts;
        this.damage = damage;
        this.agility = agility;
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
    private void takeDamage(int amount) {
        System.out.println(name + " takes " + amount + " damage");
        this.hitPoints -= amount;
        if (hitPoints < 0){
            hitPoints = 0;
            hearts -= 1;
            if (hearts == 0) {
                System.out.println(name + " is killed!");
            }
        }
    }

    /**
     * The Hero attacks another Hero
     *
     * @param enemy the enemy Hero
     */
    public void attack(Hero enemy) {
        enemy.takeDamage(damage);
    }

    /**
     * Checks if the hero has fallen
     *
     * prints fallen message
     * checks if the hero's hearts are 0
     * @return true if the hero's hearts are 0, false otherwise.
     */
    public boolean hasFallen() {
        return (hearts == 0);
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
     * Calculates the initiative of the hero
     * @return the initiative roll of the hero
     */
    public int rollInitiative() {
        return this.agility;
    }

    /**
     * Prompts the user for the Hero's action against the enemy
     * @param enemy the enemy Hero. All actions towards enemies are directed at enemy
     */
    public void promptAction(Hero enemy) {
        System.out.println("What does " + this.name + " do?");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        switch (input) {
            case "attack":
                this.attack(enemy);
                break;
            default:
                System.out.println(input + " is not a valid command");
        }
    }

    /**
     * Moves the hero to the given row and column
     * @param row the row moved to
     * @param col the column moved to
     * @return true if the Hero can move to the location, false otherwise
     */
    public boolean move(int row, int col) {
        // TODO
        return false;
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
