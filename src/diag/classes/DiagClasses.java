/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diag.classes;

/**
 *
 * @author Kimy
 */
public class DiagClasses {

    /**
     * @param args the command line arguments
     */
    public class Main {
    public static void main(String[] args) {

        // Création des auteurs
        Auteur a1 = new Auteur("Saint-Exupéry", "Antoine", 1902);
        Auteur a2 = new Auteur("Camus", "Albert", 1913);

        // Création des livres
        Livre l1 = new Livre("Le Petit Prince", 96, a1);
        Livre l2 = new Livre("Vol de nuit", 248, a1);
        Livre l3 = new Livre("L'Étranger", 184, a2);

        // Création de la bibliothèque
        Bibli bibli = new Bibli();

        // Ajout des livres
        bibli.ajouterLivre(l1);
        bibli.ajouterLivre(l2);
        bibli.ajouterLivre(l3);

        // Affichage
        bibli.afficherLivres();
    }
}
