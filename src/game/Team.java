package game;

import heroes.Hero;

import java.util.ArrayList;
import java.util.List;

/**
 * The Team class
 *
 * Represents a team of heroes
 *
 * @author OliveGarch
 */
public class Team {

    ArrayList<Hero> heroes = new ArrayList<>();
    String teamName;

    public Team(String name) {
        this.teamName = name;
    }

    public void addHero(Hero hero) {
        this.heroes.add(hero);
    }

    public void removeHero(Hero hero) {
        this.heroes.add(hero);
    }

    public String getTeamName() {
        return teamName;
    }

    public List<Hero> getHeroes() {
        return this.heroes;
    }

    @Override
    public String toString() {
        String result = teamName + ":\n";
        for (Hero hero : this.heroes) {
            result += "\t" + hero.toString() + "\n";
        }
        return result;
    }
}
