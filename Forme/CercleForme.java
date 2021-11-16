import static java.lang.Math.PI;

public class CercleForme extends Forme {
    double rayon;

    public CercleForme(double rayon) {
        this.rayon = rayon;
    }

    @Override
    double calculerPerimetre() {
        return 2*PI*rayon ;
    }

    @Override
    double calculersurface() {
        return PI*rayon*rayon;
    }
}

