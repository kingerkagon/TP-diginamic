public class TestTheatre {
    public static void main(String[] args) {
        Theatre piece1 = new Theatre("Le diner de con",50,15,15.0);
        piece1.inscrire(5,2.0);
        piece1.inscrire(5,2.0);
        piece1.inscrire(5,2.0);
        piece1.inscrire(5,2.0);
        piece1.inscrire(5,2.0);
        piece1.inscrire(5,2.0);
        piece1.inscrire(5,2.0);
        piece1.inscrire(5,2.0);

        System.out.println(piece1.getCapaciteMax());
        System.out.println(piece1.getTotalInscrit());
        System.out.println(piece1.getRecetteTotal());
    }
}
