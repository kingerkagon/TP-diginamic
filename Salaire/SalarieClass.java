public class SalarieClass extends Intervenant {
    double salaireMensuel;

    public SalarieClass(String nom, String prenom, double salaireMensuel) {
        super.nom = nom;
        super.prenom = nom;
        this.salaireMensuel = salaireMensuel;
    }

    @Override
    public double getSalaire() {
        return salaireMensuel;
    }
}
