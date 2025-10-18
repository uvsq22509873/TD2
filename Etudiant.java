public class Etudiant extends Personne {
    private String numeroEtudiant;
    
    public Etudiant(String nom, String prenom, int age, String numeroEtudiant) {
        super(nom, prenom, age);
        this.numeroEtudiant = numeroEtudiant;
    }
    
    public String getNumeroEtudiant() { return numeroEtudiant; }
    
    @Override
    public String toString() {
        return super.toString() + " - " + numeroEtudiant;
    }
}