package game;

/**
 * @author OliveGarch
 */
public abstract class Fight {
    protected String battleReport;
    protected String location;

    public abstract void fightRound();

    public abstract void fightComplete();

    public String getBattleReport() {
        return battleReport;
    }
}
