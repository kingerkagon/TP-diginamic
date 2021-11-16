import java.util.*;

public class Ville implements Comparable<Ville> {
    String nom;

    public String getNom() {
        return nom;
    }

    public int getHabitants() {
        return habitants;
    }

    int habitants;

//    @Override
//    public int compareTo(Ville ville1) {
//        int result = this.nom.compareTo(ville1.nom);
//        return result;
//    }

    @Override
    public int compareTo(Ville autre) {
        if (this.habitants > autre.habitants ){
            return 1;
        }
        if(this.habitants < autre.habitants){
            return -1;
        }
        else{
            return 0;
        }
    }

    public Ville(String nom, int habitants) {
        this.nom = nom;
        this.habitants = habitants;
    }

    static List<Ville> maListe = new ArrayList<Ville>();
    static Ville ville1 = new Ville("Nice",343000);
    static Ville ville2 = new Ville("Carcassonne",47800);
    static Ville ville3 = new Ville("Narbonne",53400);
    static Ville ville4 = new Ville("Lyon",484000);
    static Ville ville5 = new Ville("Foix",9700);
    static Ville ville6 = new Ville("Pau",77200);
    static Ville ville7 = new Ville("Marseille",850700);
    static Ville ville8 = new Ville("Tarbes",40600);

    public static void main(String[] args) {
        maListe.add(ville1);
        maListe.add(ville2);
        maListe.add(ville3);
        maListe.add(ville4);
        maListe.add(ville5);
        maListe.add(ville6);
        maListe.add(ville7);
        maListe.add(ville8);

        int max = 0;
        String villeMax = "";
        int min = 2147483647;

        for (int i = 0; i < maListe.size(); i++) {
            if (maListe.get(i).habitants > max)
                max = maListe.get(i).habitants;
                villeMax = maListe.get(i).nom;
            if (maListe.get(i).habitants < min){
                min = i;
                System.out.println("A détruire : "+maListe.get(i).nom);
            }
        }
        maListe.remove(min);
        Collections.sort(maListe,new ComparatorNom());

        for (int i = 0; i < maListe.size(); i++) {
            System.out.println(maListe.get(i).nom);
        }
    }

}
