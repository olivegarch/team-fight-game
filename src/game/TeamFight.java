package game;

/**
 * @author OliveGarch
 */
public class TeamFight extends Fight{

    private Team team1;
    private Team team2;

    public TeamFight(Team team1, Team team2) {
        this.team1 = team1;
        this.team2 = team2;
        this.battleReport = team1.getTeamName() + " engages " + team2.getTeamName() + " in the field";
    }

    @Override
    public void fightRound() {
        // TODO
    }

    @Override
    public void fightComplete() {
        // TODO
    }
}
