public class Main {
    public static void main(String[] args) {
        Personne personne = new Personne("Benali", "Fatima", 25);
        Etudiant etudiant = new Etudiant("Alami", "Ahmed", 20, "22509873");
        Professeur professeur = new Professeur("Smith", "John", 45, "Informatique");
        Cours cours = new Cours("Programmation Java", professeur);
        
        System.out.println("=== TD2 - Système Université ===");
        System.out.println("Personne: " + personne);
        System.out.println("Étudiant: " + etudiant);
        System.out.println("Professeur: " + professeur);
        System.out.println("Cours: " + cours);
        
        etudiant.setAge(21);
        System.out.println("\n=== Après modification ===");
        System.out.println("Étudiant mis à jour: " + etudiant);
    }
}