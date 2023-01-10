package soccer;

public class Coach extends Person {

    private int experience;

    public Coach(String name, int age, int experience) {
        super(name, age); // --> Aufruf des Konstruktors von Person
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "\nCoach\n" +
                "name: " + this.name +
                "\nage: " + this.age +
                "\nexperience: " + this.experience;
    }

    public int getExperience() {
        return this.experience;
    }
}
