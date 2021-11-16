public class TestMaison {
    public static void main(String[] args) throws Exception {

        Cuisine piece2 = new Cuisine(12,0);
        Salon piece3 = new Salon(12,0);
        SalleDeBain piece4 = new SalleDeBain(10,1);
        WC piece5 = new WC(10,0);
        WC piece6= new WC(20,1);

        Maison.ajoutePiece(piece2);
        Maison.ajoutePiece(piece3);
        Maison.ajoutePiece(piece4);
        Maison.ajoutePiece(piece5);
        Maison.ajoutePiece(piece6);

        double superficieTotal = Maison.calculSuperficie();
        System.out.println(superficieTotal);

        double superficieTotalEtage = Maison.calculSuperficieEtage(0);
        System.out.println(superficieTotalEtage);

        int nombrePiece = Maison.nombrePieceType("WC");
        System.out.println(nombrePiece);



    }
}
