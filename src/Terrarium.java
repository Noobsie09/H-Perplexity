

public class Terrarium {
    private Gecko gecko;
    private Leguan leguan;

    public Terrarium(Gecko gecko, Leguan leguan) {
        this.gecko = gecko;
        this.leguan = leguan;
    }

    public void Leguanfüttern(){
        System.out.println("Der Tierquäler hat voller freude den Leguan gemästet");
        leguan.setGewicht(leguan.getGewicht()+1);
        System.out.println(" ");
    }
    public void Geckofüttern(){
        System.out.println("Der Tierquäler hat voller freude den Geggo gemästet");
        gecko.setGewicht(gecko.getGewicht()+1);
        System.out.println(" ");
    }

    public void Leguanaltern(){
        System.out.println("Der Tierquäler hat den Leguan vernachlässigt");
        leguan.setAlter(leguan.getAlter()+1);
        leguan.setLänge(leguan.getLänge()+2);
        leguan.setKammlänge(leguan.getKammlänge()+3);
        System.out.println(" ");
    }
    public void Geckoaltern(){
        System.out.println("Der Tierquäler hat den Geggo vernachlässigt");
        gecko.setAlter(gecko.getAlter()+1);
        gecko.setLänge(gecko.getLänge()+2);
        System.out.println(" ");
    }



    public void ausgeben(){
        System.out.println("LEGUAN STATS:");
        System.out.println(" ");
        System.out.println("NAME: " + leguan.getName());
        System.out.println("ALTER: " + leguan.getAlter());
        System.out.println("GEWICHT: " + leguan.getGewicht() + " KG");
        System.out.println("KÖRPERLÄNGE: " + leguan.getLänge() + " CM");
        System.out.println("KAMMLÄNGE: " + leguan.getKammlänge() + " MM");
        System.out.println(" ");
        System.out.println("----------------------");
        System.out.println(" ");
        System.out.println("GEGGO STATS:");
        System.out.println(" ");
        System.out.println("NAME: " + gecko.getName());
        System.out.println("ALTER: " + gecko.getAlter());
        System.out.println("GEWICHT: " + gecko.getGewicht() + " KG");
        System.out.println("KÖRPERLÄNGE: " + gecko.getLänge() + " CM");
        System.out.println("HAFTFÄHIGKEIT: " + gecko.getHaftfähigkeit() + " SEKUNDEN");

    }

}
