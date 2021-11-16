import java.util.ArrayList; // import the ArrayList class

public class CreationListe {

    static ArrayList<Integer> maListe = new ArrayList<Integer>(); // Create an ArrayList object

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            maListe.add(i);
        }
        System.out.println(maListe.size());
        System.out.println(maListe);
    }
}


