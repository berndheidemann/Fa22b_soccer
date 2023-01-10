package soccer;

public class Game {

    private Team home;
    private Team away;
    private int homeGoals;
    private int awayGoals;

    public Game(Team home, Team away) {
        this.home = home;
        this.away = away;
        this.awayGoals = 0;
        this.homeGoals = 0;
    }

    @Override
    public String toString() {
        return home.getName() + " - " + away.getName();
    }

    public String getScore() {
        return homeGoals + ":" + awayGoals;
    }

    public void increaseHomeGoals() {
        this.homeGoals++;
    }

    public void increaseAwayGoals() {
        this.awayGoals++;
    }

    public Team getHome() {
        return home;
    }

    public Team getAway() {
        return away;
    }
}
