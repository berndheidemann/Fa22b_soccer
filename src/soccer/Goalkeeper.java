package soccer;

import java.util.Random;

public class Goalkeeper extends Player{

    private int reaction;

   public Goalkeeper(String name, int age, int powerAtGoalKick, int force, int motivation, int numberOfGoals) {
       // super steht für die Elternklasse
       super(name, age, force, powerAtGoalKick, motivation, numberOfGoals);
   }


}
