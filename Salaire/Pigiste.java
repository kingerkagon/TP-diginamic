public class Pigiste extends Intervenant {
    int jourTravaillésMois;
    double remunerationJours;

    public Pigiste(String nom, String prenom, double salaireMensuel,int joursTravaillés) {
        super.nom = nom;
        super.prenom = nom;
        this.remunerationJours = salaireMensuel;
        this.jourTravaillésMois = joursTravaillés;
    }

    @Override
    public double getSalaire() {
        return jourTravaillésMois*remunerationJours;
    }
}
