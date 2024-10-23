public class Gecko extends Echse{

    private double haftfähigkeit;
    // Konstruktor Gecko
    public Gecko(String name, int alter, double gewicht, double länge, double haftfähigkeit) {
        super(name, alter, gewicht, länge);
        this.haftfähigkeit=haftfähigkeit;
    }
   // Methode Fürs kletern
    public void kletern(){
        System.out.println("Der Geggo wurde von den Tierqualer verscheucht und ist vor furcht auf einen Baum geflohen!!");
    }

    // Getter für die Haftfähigkeit
    public double getHaftfähigkeit() {
        return haftfähigkeit;
    }
    // Setter für die Haftfähigkeit
    public void setHaftfähigkeit(double haftfähigkeit) {
        this.haftfähigkeit = haftfähigkeit;
    }
}
