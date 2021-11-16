import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestListInt {
    public static void main(String[] args) {
        List<Integer> maListe = new ArrayList<Integer>(Arrays.asList(-1, 5, 7, 3, -2, 4, 8, 5));
        System.out.println(maListe);
        System.out.println(maListe.size());
        int max = Collections.max(maListe);
        int min = Collections.min(maListe);
        int monIndex = maListe.indexOf(min);
        //maListe.remove(monIndex);
        System.out.println(maListe);

        List<Integer> maListeAbsolue = new ArrayList<Integer>();
        for (int i = 0; i < maListe.size(); i++) {
            if (maListe.get(i) >= 0 ){
                maListeAbsolue.add(maListe.get(i));
            }
            if (maListe.get(i)<0){
                maListeAbsolue.add(Math.abs(maListe.get(i)));
            }
        }
        System.out.println(maListeAbsolue);

    }
}
