public class Main {
    public static void main(String[] args) {
     // Hier entsteht ein Neuer Gecko

    Gecko geggo = new Gecko("Dave the magil cheese wizard",1,1,24.187,3);

    // Hier entsteht eine neuer Leguan

    Leguan legi = new Leguan("Benni",2,2,25,26);

    //Hier entsteh ein neues Terrarium

    Terrarium terri = new Terrarium(geggo,legi);

    // Hier werden die Ganzen Methoden Aufgerufen

    terri.ausgeben();
    terri.Leguanaltern();
    terri.Leguanfüttern();
    terri.Geckoaltern();
    terri.Geckofüttern();
    terri.ausgeben();







    }
}