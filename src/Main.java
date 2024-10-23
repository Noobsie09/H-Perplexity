public class Main {
    public static void main(String[] args) {
    Gecko geggo = new Gecko("Dave the magil cheese wizard",1,1,24.187,3);
    Leguan legi = new Leguan("Benni",2,2,25,26);
    Terrarium terri = new Terrarium(geggo,legi);

    terri.ausgeben();
    terri.Leguanaltern();
    terri.Leguanfüttern();
    terri.Geckoaltern();
    terri.Geckofüttern();
    terri.ausgeben();







    }
}