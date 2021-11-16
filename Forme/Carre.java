public class Carre extends Forme {
    double longueur;

    public Carre(double longueur) {
        this.longueur = longueur;
    }

    @Override
    double calculerPerimetre() {
        return longueur*4;
    }

    @Override
    double calculersurface() {
        return longueur*longueur;
    }
}
