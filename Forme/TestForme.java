public class TestForme {

    public static void main(String[] args) {
        Carre monCarre = new Carre(5);
        CercleForme monCercle = new CercleForme(10);
        Rectangle monRectangle = new Rectangle(15,5);

        AffichageForme.afficher(monCarre);
        AffichageForme.afficher(monCercle);
        AffichageForme.afficher(monRectangle);
    }
}
