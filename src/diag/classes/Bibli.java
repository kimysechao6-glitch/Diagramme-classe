/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diag.classes;

/**
 *
 * @author Kimy
 */
import java.util.ArrayList;

public class Bibli {

    // Attribut : une liste de livres
    ArrayList<Livre> livres;

    // Constructeur : on initialise la liste vide
    public Bibli() {
        livres = new ArrayList<Livre>();
    }

    // Méthode pour ajouter un livre
    public void ajouterLivre(Livre livre) {
        livres.add(livre);
    }

    // Méthode pour afficher tous les livres
    public void afficherLivres() {
        System.out.println("=== Bibliothèque ===");
        for (Livre l : livres) {
            l.afficherDescription();
            System.out.println(); // ligne vide pour la lisibilité
        }
    }
}
