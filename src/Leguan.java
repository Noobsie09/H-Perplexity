public class Leguan extends Echse{
    double kammlänge;
    public Leguan(String name, int alter, double gewicht, double länge, double kammlänge) {
        super(name, alter, gewicht, länge);
        this.kammlänge = kammlänge;
    }
    public void schwimmen(){
        System.out.println("Der Leguan ist vor dem Tierquäler aus furcht davongeschommen!");
    }

    public double getKammlänge() {
        return kammlänge;
    }

    public void setKammlänge(double kammlänge) {
        this.kammlänge = kammlänge;
    }
}
