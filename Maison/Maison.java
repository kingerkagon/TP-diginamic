public class Maison {
    static Chambre piece1 = new Chambre(15,1);
    static Piece[] maMaison = {piece1};
    static public void ajoutePiece (Piece piece) throws Exception {
        if(piece == null || piece.etage<0 || piece.superficie<0){
            throw new Exception("Nouvelles Pièce incohérente");
        }
        Piece[] nouvelMaison = new Piece[maMaison.length+1];
        for (int i = 0; i < nouvelMaison.length; i++) {
            if (i < nouvelMaison.length-1) {
                nouvelMaison[i] = maMaison[i];
            }
            if (i == nouvelMaison.length-1){
                nouvelMaison[i] = piece;
            }
        }
        maMaison = nouvelMaison;
    }

    public static double calculSuperficie(){
        double superficieTotal = 0;
        for (int i = 0; i < maMaison.length; i++) {
            superficieTotal += maMaison[i].superficie;
        }
        return superficieTotal;
    }

    public static double calculSuperficieEtage(int etage){
        double superficieTotalEtage = 0;
        for (int i = 0; i < maMaison.length; i++) {
            if (maMaison[i].etage == etage){
                superficieTotalEtage += maMaison[i].superficie;
            }
        }
        return superficieTotalEtage;
    }

    public static int nombrePieceType(String type){
        int nommbrePieceType = 0;
        for (int i = 0; i < maMaison.length; i++) {
            if (maMaison[i].getClass().getName() == type){
                nommbrePieceType += 1;
            }
        }
        return nommbrePieceType;
    }
}
