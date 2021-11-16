import java.util.concurrent.ThreadLocalRandom;

public class loup extends Creature{
    public loup() {
        int randomforce = ThreadLocalRandom.current().nextInt(1, 8 + 1);
        int randomLife = ThreadLocalRandom.current().nextInt(5, 10 + 1);
        this.force = randomforce;
        this.pointDeVie = randomLife;
    }
}
