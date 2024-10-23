public class Gecko extends Echse{
    private double haftfähigkeit;
    public Gecko(String name, int alter, double gewicht, double länge, double haftfähigkeit) {
        super(name, alter, gewicht, länge);
        this.haftfähigkeit=haftfähigkeit;
    }
    public void kletern(){
        System.out.println("Der Geggo wurde von den Tierqualer verscheucht und ist vor furcht auf einen Baum geflohen!!");
    }

    public double getHaftfähigkeit() {
        return haftfähigkeit;
    }

    public void setHaftfähigkeit(double haftfähigkeit) {
        this.haftfähigkeit = haftfähigkeit;
    }
}
