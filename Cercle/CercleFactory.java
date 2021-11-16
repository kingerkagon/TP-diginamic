public class CercleFactory {
    public static Cercle cercleBuilder(double monRayon){
        Cercle monCercle = new Cercle(monRayon);
        double monRayon1 = monCercle.getRayon();
        return monCercle;
    }
}
