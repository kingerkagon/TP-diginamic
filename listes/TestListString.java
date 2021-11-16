import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestListString {
    public static void main(String[] args) {
        List<String> maListe = new ArrayList<>(Arrays.asList("Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes"));


        int plusGrand = 0;
        int indexMax = 0;
        for (int i = 0; i < maListe.size() ; i++) {
            if (maListe.get(i).length() > plusGrand){
                plusGrand = maListe.get(i).length();
                indexMax = i;
            }
        }
        maListe.replaceAll(String::toUpperCase);
        System.out.println(maListe.get(indexMax));

        for (int i = 0; i < maListe.size(); i++) {
            if (maListe.get(i).charAt(0) == 'N'){
                System.out.println("A supprimer");
                maListe.remove(i);
            }
        }
        System.out.println(maListe);
    }
}
