public class Rectangle extends Forme{
    double longueur;
    double largeur;

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    @Override
    double calculersurface() {
        return (longueur*2)+(largeur*2);
    }

    @Override
    double calculerPerimetre() {
        return longueur*largeur;
    }
}
