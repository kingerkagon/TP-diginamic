import java.util.concurrent.ThreadLocalRandom;

public class troll extends Creature{
    public troll() {
        int randomforce = ThreadLocalRandom.current().nextInt(10, 15 + 1);
        int randomLife = ThreadLocalRandom.current().nextInt(20, 30 + 1);
        this.force = randomforce;
        this.pointDeVie = randomLife;
    }
}
