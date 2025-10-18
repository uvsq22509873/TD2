public class Cours {
    private String nomCours;
    private Professeur professeur;
    
    public Cours(String nomCours, Professeur professeur) {
        this.nomCours = nomCours;
        this.professeur = professeur;
    }
    
    public String getNomCours() { return nomCours; }
    public Professeur getProfesseur() { return professeur; }
    
    public String toString() {
        return "Cours: " + nomCours + " | Enseignant: " + professeur.getPrenom() + " " + professeur.getNom();
    }
}
