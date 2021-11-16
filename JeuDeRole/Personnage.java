import java.util.concurrent.ThreadLocalRandom;

public class Personnage {
    int force;
    int pointDeVie;
    int score;

    public Personnage() {
        int randomforce = ThreadLocalRandom.current().nextInt(12, 18 + 1);
        int randomLife = ThreadLocalRandom.current().nextInt(20, 50 + 1);
        this.force = randomforce;
        this.pointDeVie = randomLife;
        this.score = 0;
    }
}
