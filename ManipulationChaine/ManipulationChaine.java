import java.util.Arrays;
import java.util.Locale;

public class ManipulationChaine {
    static String chaine = "Durand;Marcel;2 523.5";

    public static void main(String[] args) {
        char premierCharacter = chaine.charAt(0);
        char c = ';';
        System.out.println(chaine.length());
        System.out.println(premierCharacter);
        System.out.println(chaine.indexOf(c));
        String nomFamille = chaine.substring(0,chaine.indexOf(c));
        System.out.println(nomFamille.toUpperCase(Locale.ROOT));
        System.out.println(nomFamille.toLowerCase(Locale.ROOT));
        String[] monTableau = chaine.split(";");
        System.out.println(Arrays.toString(monTableau));
        String monSalaire = monTableau[2].replace(" ","");

        Salarie salarie1 = new Salarie(monTableau[0],monTableau[1],Double.parseDouble(monSalaire));
        System.out.println(salarie1.nom);
        System.out.println(salarie1.prenom);
        System.out.println(salarie1.salaire);
    }
}
