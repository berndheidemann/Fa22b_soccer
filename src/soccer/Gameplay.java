package soccer;

import java.util.Random;

public class Gameplay {

    private static final int PLAYING_TIME = 90;
    private static final int MAX_ADDITIONAL_TIME = 5;
    private static final int MAX_DURATION_UNTIL_NEXT_ACTION = 15;

    private Game game;

    public Gameplay(Game game) {
        this.game = game;
    }

    private int calculateForceOfTheTeam(Team team) {
        int force = team.getTotalForce();
        int motivation = team.getTotalMotivation();
        int coach_exp = team.getCoach().getExperience();
        Random r = new Random();
        int total = force * motivation * coach_exp + (r.nextInt(7) - 3);
        if (total < 1) {
            return 1;
        }
        return total;
    }

    private void doGameAction(Player player, Goalkeeper goalkeeper, int minute, Team team) {
        System.out.println(minute + ". Minute:");
        System.out.println(" Chance fuer " + team.getName());
        System.out.println("   " + player.getName() + " zieht ab");

        if (goalkeeper.ballHold(player.shootAtGoal())) {
            System.out.println("   " + goalkeeper.getName() + " pariert glanzvoll");
        } else {
            if (game.getHome() == team) {
                game.increaseHomeGoals();
            } else {
                game.increaseAwayGoals();
            }
            player.addGoal();
            String s = String.format("TOR!!!   %s %s(%d)", game.getScore(), player.getName(), player.getNumberOfGoals());
            System.out.println(s);
        }
    }

    private void delay() {
        for (long i = 0; i < 214740000; i++) {
            for (long j = 0; j < 10; j++) {
            }
        }
    }

    public void play() {
        System.out.println(this.game.toString());
        Random r = new Random();
        int playtime = PLAYING_TIME + r.nextInt(MAX_ADDITIONAL_TIME + 1);
        int nextAction = r.nextInt(MAX_DURATION_UNTIL_NEXT_ACTION) + 1;
        int currentMinute = nextAction;
        while (currentMinute < playtime) {
            int forceHome = calculateForceOfTheTeam(this.game.getHome());
            int forceAway = calculateForceOfTheTeam(this.game.getAway());
            int rnd = r.nextInt(forceHome + forceAway);
            if (rnd >= forceHome) {
                // Gastmannschaft ist dran
                Player p = this.game.getAway().getRandomPlayer();
                Goalkeeper g = this.game.getHome().getGoalkeeper();
                doGameAction(p, g, currentMinute, this.game.getAway());
            } else {
                // Heimmannschaft ist dran
                Player p = this.game.getHome().getRandomPlayer();
                Goalkeeper g = this.game.getAway().getGoalkeeper();
                doGameAction(p, g, currentMinute, this.game.getHome());
            }
            delay();
            nextAction = r.nextInt(MAX_DURATION_UNTIL_NEXT_ACTION) + 1;
            currentMinute += nextAction;
        }
        delay();
        System.out.println("Das Spiel ist aus!");
        System.out.println(game + " - " + game.getScore());


    }


}
