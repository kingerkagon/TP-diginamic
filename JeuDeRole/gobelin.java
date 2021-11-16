import java.util.concurrent.ThreadLocalRandom;

public class gobelin extends Creature {
    public gobelin() {
        int randomforce = ThreadLocalRandom.current().nextInt(5, 10 + 1);
        int randomLife = ThreadLocalRandom.current().nextInt(10, 15 + 1);
        this.force = randomforce;
        this.pointDeVie = randomLife;
    }
}
