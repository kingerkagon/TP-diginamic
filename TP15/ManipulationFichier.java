import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class ManipulationFichier {
    public static void main(String[] args) throws IOException {
        Path pathOrigine = Paths.get("TP15/recensement.csv");
        Path pathDestination = Paths.get("TP15/resultat.csv");
        boolean exists = Files.exists(pathOrigine);

        List<String> lines = Files.readAllLines(pathOrigine, StandardCharsets.UTF_8);
        List<String> mesLignes = new ArrayList<>();

        for (String line: lines){
            String[] monSplit = line.split(";");
            monSplit[7] = monSplit[7].trim().replaceAll(" ", "");

            try {
                if (Integer.parseInt(monSplit[7]) > 25000){
                    String maLigne = monSplit[0]+";"+monSplit[1]+";"+monSplit[7];
                    mesLignes.add(maLigne);
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        Files.write(pathDestination,mesLignes,StandardCharsets.UTF_8, StandardOpenOption.CREATE);
    }
}
