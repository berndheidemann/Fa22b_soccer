package soccer;

import java.util.ArrayList;
import java.util.Random;

public class Team {

    private String name;
    private Coach coach;
    private Goalkeeper goalkeeper;
    private ArrayList<Player> squad;

    public Team(String name, Coach coach, Goalkeeper goalkeeper) {
        this.name = name;
        this.coach = coach;
        this.goalkeeper = goalkeeper;
        this.squad = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        this.squad.add(player);
    }

    public int getTotalMotivation() {
        int totalMovitation = 0;
        for (int i = 0; i < this.squad.size(); i++) {
            Player p = this.squad.get(i);
            totalMovitation += p.getMotivation();
        }
        totalMovitation += this.goalkeeper.getMotivation();
        return totalMovitation / (this.squad.size() + 1);
    }

    public int getTotalForce() {
        int totalForce = 0;
        for (int i = 0; i < Math.min(10, this.squad.size()); i++) {
            Player p = this.squad.get(i);
            totalForce += p.getForce();
        }
        totalForce += this.goalkeeper.getForce();
        return totalForce / (Math.min(10, this.squad.size()) + 1);
    }

    @Override
    public String toString() {
        String result = "***Mannschaft***\n";
        result += "Trainer: " + this.coach.getName() + "\n";
        result += "Torhüter: " + this.goalkeeper.getName() + "\n";
        for (Player p : this.squad) {
            result += "Spieler: " + p.getName() + "\n";
        }
        return result;
    }


    public String getName() {
        return this.name;
    }

    public Coach getCoach() {
        return this.coach;
    }

    public Player getRandomPlayer() {
        Random r = new Random();
        return this.squad.get(r.nextInt(this.squad.size()));
    }

    public Goalkeeper getGoalkeeper() {
        return this.goalkeeper;
    }
}
