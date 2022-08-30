package game;

import heroes.Hero;

/**
 * The HeroFight class
 *
 * represents a fight between 2 individual heroes.
 *
 * @author OliveGarch
 */
public class HeroFight extends Fight{

    private Hero hero1;
    private Hero hero2;

    private String battleReport;

    public HeroFight(Hero hero1, Hero hero2) {
        this.hero1 = hero1;
        this.hero2 = hero2;
        System.out.println(hero1.getName() + " engages " + hero2.getName() + " in the field");
//        this.battleReport = hero1.getName() + " engages " + hero2.getName() + " in the field";
    }

    /**
     * Fights a single round between the two heroes
     */
    @Override
    public void fightRound() {
        int hero1InitRoll = hero1.rollInitiative();
        int hero2InitRoll = hero2.rollInitiative();
        if (hero1InitRoll > hero2InitRoll) {
            System.out.println(hero1.getName() + " gets the initiative");

            // TODO
        } else if (hero2InitRoll > hero1InitRoll) {
            // TODO
        } else {
            // TODO
        }
    }

    @Override
    public void fightComplete() {
        // TODO
    }
}
