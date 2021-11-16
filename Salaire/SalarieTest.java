public class SalarieTest {
    public static void main(String[] args) {
        SalarieClass intervenant1 = new SalarieClass("STUHLFAUTH","Eric",2500);
        Pigiste intervenant2 = new Pigiste("STUHLFAUTH","Nicolas",200,12);

        System.out.println(intervenant1.getSalaire());
        System.out.println(intervenant2.getSalaire());
    }
}
