public class Echse {
    private String name;
    private int alter;
    private double gewicht;
    private double länge;

    public Echse(String name, int alter, double gewicht, double länge) {
        this.name = name;
        this.alter = alter;
        this.gewicht = gewicht;
        this.länge = länge;
    }

    public void bewegen(){
        System.out.println("Die Eidechse hat sich um 3mm bewegt! du Tierquäler");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public double getGewicht() {
        return gewicht;
    }

    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    public double getLänge() {
        return länge;
    }

    public void setLänge(double länge) {
        this.länge = länge;
    }
}

