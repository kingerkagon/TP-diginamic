public class TestCercle {
    public static void main(String[] args) {
        Cercle cercle1;
        double monRayon = 3.55;
        cercle1 = CercleFactory.cercleBuilder(monRayon);

        System.out.println(cercle1.calculPerimetre(monRayon));
        System.out.println(cercle1.calculSurface(monRayon));
    }
}
