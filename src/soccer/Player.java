package soccer;

import java.util.Random;

public class Player extends Person {


    protected int force;
    protected int powerAtGoalKick;
    protected int motivation;
    protected int numberOfGoals;

    public Player(String name, int age, int force, int powerAtGoalKick, int motivation, int numberOfGoals) {
        super(name, age);
        this.force = force;
        this.powerAtGoalKick = powerAtGoalKick;
        this.motivation = motivation;
        this.numberOfGoals = numberOfGoals;
    }

    public int shootAtGoal() {
        int result = 0;
        int diff = 0;
        Random rand = new Random();
        diff = rand.nextInt(4) - 2;  // -2, -1, 0, 1
        result = powerAtGoalKick + diff;
        return validate(result);
    }

    protected int validate(int number) {
        if (number < 1) {
            return 1;
        }
        if (number > 10) {
            return 10;
        }
        return number;
    }

    public int getMotivation() {
        return this.motivation;
    }

    @Override
    public String toString() {
        return "\nPlayer\n" + "name: " + this.name + "\nage: " + this.age + "\nforce: " + this.force + "\nmotivation: " + this.motivation + "\npowerAtGoalKick: " + this.powerAtGoalKick + "\nnumberOfGoals: " + this.numberOfGoals;
    }

    public void addGoal() {
        this.numberOfGoals++;
    }

    public int getForce() {
        return this.force;
    }

    public int getNumberOfGoals() {
        return numberOfGoals;
    }
}
