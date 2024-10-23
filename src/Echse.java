public class Echse {
    // Instanz Variablen

    private String name;
    private int alter;
    private double gewicht;
    private double länge;

    // Konstruktor von der Echse

    public Echse(String name, int alter, double gewicht, double länge) {
        this.name = name;
        this.alter = alter;
        this.gewicht = gewicht;
        this.länge = länge;
    }

    // Die Bewegen Methode

    public void bewegen(){
        System.out.println("Die Eidechse hat sich um 3mm bewegt! du Tierquäler");
    }

    // Getter für den Namen

    public String getName() {
        return name;
    }

    // Setter für den Namen

    public void setName(String name) {
        this.name = name;
    }

    // Getter für das Alter

    public int getAlter() {
        return alter;
    }

    // Setter für das Alter

    public void setAlter(int alter) {
        this.alter = alter;
    }

    // Getter für das Gewicht

    public double getGewicht() {
        return gewicht;

    }

    // Setter für dsa Gewicht

    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }
    // Getter für die Länge

    public double getLänge() {
        return länge;
    }

    // Setter für die Länge

    public void setLänge(double länge) {
        this.länge = länge;
    }

}

