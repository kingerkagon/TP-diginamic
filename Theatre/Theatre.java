public class Theatre {
    private String nom;
    private int capaciteMax = 40;
    private int totalInscrit = 0;
    private double recetteTotal = 0;

    public Theatre(String nom, int capaciteMax, int totalInscrit, double recetteTotal) {
        this.nom = nom;
        this.capaciteMax = capaciteMax;
        this.totalInscrit = totalInscrit;
        this.recetteTotal = recetteTotal;
    }

    public void inscrire(int nombreClient, double prixPlace){
        if (this.totalInscrit+nombreClient > this.capaciteMax){
            System.out.println("Nombre max de client atteint");
        }
        else{
            this.totalInscrit += nombreClient;
            this.recetteTotal += prixPlace*nombreClient;
        }
    }

    public String getNom() {
        return nom;
    }

    public int getCapaciteMax() {
        return capaciteMax;
    }

    public int getTotalInscrit() {
        return totalInscrit;
    }

    public double getRecetteTotal() {
        return recetteTotal;
    }
}
