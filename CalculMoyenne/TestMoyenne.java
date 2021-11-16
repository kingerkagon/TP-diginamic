import java.util.Arrays;
public class TestMoyenne {
    public static void main(String[] args) {
        CalculMoyenne.ajout(2);
        CalculMoyenne.ajout(1);
        CalculMoyenne.ajout(1);
        double monTableau[] = CalculMoyenne.getMontableau();
        double maMoyenne = CalculMoyenne.calculMoyenne();

        System.out.println(Arrays.toString(monTableau));
        System.out.println(maMoyenne);

    }
}
