package ooEinfuehrung;

public class Schueler {

    // private: die Sichtbarkeit der Variablen (Attribute)
    // wird auf diese Klasse eingeschränkt
    private String name;
    private String klasse;

    // Konstruktor
    // Die Methode, die aufgerufen wird
    // wenn wir ein neues Objekt vom Typ Schueler bauen
    public Schueler(String name, String klasse) {
        this.name=name;
        this.klasse=klasse;
    }

    public void print() {
        System.out.println(name + ", " + klasse);
    }

    // Schueler sollen die Klasse wechseln können
    public void setKlasse(String klasse) {
        this.klasse=klasse;
    }






}
