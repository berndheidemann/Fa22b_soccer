package soccer;

import java.security.PrivilegedExceptionAction;
import java.util.Random;

public class Goalkeeper extends Player {
    private int reaction;

    public Goalkeeper(String name, int age, int powerAtGoalKick, int force, int motivation, int reaction) {
        // super steht für die Elternklasse
        super(name, age, force, powerAtGoalKick, motivation, 0);
        this.reaction = reaction;
    }

    public String toString() {
        return "\nGoalkeeper\n" +
                "reaction: " + reaction +
                "\nname: " + name +
                "\nforce: " + this.force +
                "\nmotivation: " + this.motivation +
                "\npowerAtGoalKick: " + this.powerAtGoalKick +
                "\nnumberOfGoals: " + this.numberOfGoals;
    }

    public boolean ballHold(int powerAtGoalKick) {
        int result;
        int diff;
        Random rand = new Random();
        diff = rand.nextInt(3) - 1;  // -1, 0, 1
        result = reaction + diff;
        if (powerAtGoalKick > validate(result)) { // diff --> -1, 0, 1
            return false;
        } else {
            return true;
        }
    }




}
