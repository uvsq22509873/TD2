public class Professeur extends Personne {
    private String specialite;
    
    public Professeur(String nom, String prenom, int age, String specialite) {
        super(nom, prenom, age);
        this.specialite = specialite;
    }
    
    public String getSpecialite() { return specialite; }
    
    @Override
    public String toString() {
        return super.toString() + " - Spécialité: " + specialite;
    }
}