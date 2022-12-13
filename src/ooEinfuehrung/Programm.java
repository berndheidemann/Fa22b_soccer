package ooEinfuehrung;

public class Programm {

    public static void main(String[] args) {

        // Aus dem Bauplan Schueler (der Klasse)
        // ein Objekt bauen
        Schueler s=new Schueler("Bernd", "FA21B");
        // Methode print() aufrufen
        s.print();

        Schueler s2=new Schueler("Max", "FA22B");
        s2.print();

        s.setKlasse("FA22B");
        s.print();


    }
}
