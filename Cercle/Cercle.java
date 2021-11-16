import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Cercle {
    private double rayon;

    public double getRayon() {
        return rayon;
    }

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    public double calculPerimetre(double monRayon){
        double perimetre = 2*PI*monRayon;
        return perimetre;
    }

    public double calculSurface(double monRayon){
        double perimetre = PI*pow(monRayon,2);
        return perimetre;
    }
}
