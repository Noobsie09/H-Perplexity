public class Leguan extends Echse{

    // Instanz Variable
    double kammlänge;

    // KOnstruktor des Leguans

    public Leguan(String name, int alter, double gewicht, double länge, double kammlänge) {
        super(name, alter, gewicht, länge);
        this.kammlänge = kammlänge;
    }
    // Methode fürs Schimmen

    public void schwimmen(){
        System.out.println("Der Leguan ist vor dem Tierquäler aus furcht davongeschommen!");
    }

    // Getter für die Kammlänge

    public double getKammlänge() {
        return kammlänge;
    }

    // Setter für die Kammlänge

    public void setKammlänge(double kammlänge) {
        this.kammlänge = kammlänge;

    }
}
