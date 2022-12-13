package soccer;

public class SoccerManagerUI {

    public static void main(String[] args) {
        Player p=new Player("Meier", 27, 7, 10, 10, 0);

        System.out.println(p.shootAtGoal());
        System.out.println(p.shootAtGoal());
        System.out.println(p.shootAtGoal());
        System.out.println(p.shootAtGoal());
        System.out.println(p.shootAtGoal());
        System.out.println(p.shootAtGoal());
        System.out.println(p.shootAtGoal());

        System.out.println(p);

        Goalkeeper g=new Goalkeeper("Kahn", 37, 6, 8, 10, 2);
        System.out.println(g);
        g.addGoal();
        System.out.println(g);
    }


}
