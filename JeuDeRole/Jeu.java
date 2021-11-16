import java.awt.*;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Jeu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Voulez-vous créer un personnage ?" );
        String choix = scanner.next();

        while (!choix.equals("oui")){
            String nouveauchoix = scanner.next();
            if(scanner.next().equals("oui")){
                break;
            }
        }
        
        Personnage monPersonnage = new Personnage();
        System.out.println("Votre personnage à : "+monPersonnage.pointDeVie+" HP et "+monPersonnage.force+ " points de force.");

        while (monPersonnage.pointDeVie > 0){
            System.out.println("Voulez-vous engagez le combat avec une nouvelle créature ?");
            String choix2 = scanner.next();
            while (!choix2.equals("oui")){
                String nouveauchoix = scanner.next();
                if(scanner.next().equals("oui")){
                    break;
                }
            }
            Creature creature1 = null;
            int choixRandomCreature = ThreadLocalRandom.current().nextInt(1, 4);
            if (choixRandomCreature == 1) {
                creature1 = new loup();
                System.out.println("Votre adversaire est un "+creature1.getClass().getName()+ " et possède : "+creature1.pointDeVie+" HP et "+creature1.force+ " points de force.");

            }
            else if (choixRandomCreature == 2) {
                creature1 = new gobelin();
                System.out.println("Votre adversaire est un "+creature1.getClass().getName()+ " et possède : "+creature1.pointDeVie+" HP et "+creature1.force+ " points de force.");
            }
            else {
                creature1 = new troll();
                System.out.println("Votre adversaire est un "+creature1.getClass().getName()+ " et possède : "+creature1.pointDeVie+" HP et "+creature1.force+ " points de force.");
            }
            System.out.println("Lancez le combat ?");

            String choix3 = scanner.next();
            while (!choix3.equals("oui")){
                String nouveauchoix = scanner.next();
                if(scanner.next().equals("oui")){
                    break;
                }
            }
            while(creature1.pointDeVie > 0 && monPersonnage.pointDeVie > 0){
                int degatStandardAventurier = ThreadLocalRandom.current().nextInt(1, 10 + 1);
                int degatStandardCreature = ThreadLocalRandom.current().nextInt(1, 10 + 1);

                if (degatStandardAventurier+monPersonnage.force > degatStandardCreature+creature1.force){
                    creature1.pointDeVie -= (monPersonnage.force +degatStandardAventurier);
                    System.out.println("Vous gagnez le tour et vous infligez : "+degatStandardAventurier+" points de dégats au "+ creature1.getClass().getName()+".");
                    System.out.println("Il reste "+creature1.pointDeVie+" HP au "+creature1.getClass().getName()+".");
                }
                else{
                    monPersonnage.pointDeVie -= creature1.force + degatStandardCreature;
                    System.out.println("Vous perdez le tour, vous subissez : "+degatStandardAventurier+" points de dégats.");
                    System.out.println("Il vous reste "+monPersonnage.pointDeVie+" HP.");
                }
            }
            int ajoutScore =0;
            if (creature1.getClass().getName().equals("loup")){
                ajoutScore =1;
            }
            if (creature1.getClass().getName().equals("gobelin")){
                ajoutScore =2;
            }
            if (creature1.getClass().getName().equals("troll")){
                ajoutScore =3;
            }
            monPersonnage.score += ajoutScore;
            System.out.println("Votre adversaire est vaincu, vous gagnez : "+ajoutScore+" points.");
        }
        System.out.println("Game Over, votre score est : "+monPersonnage.score);
    }
}
