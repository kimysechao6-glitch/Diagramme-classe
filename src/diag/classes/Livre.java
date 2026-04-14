/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diag.classes;

/**
 *
 * @author Kimy
 */
    public class Livre {

    // Attributs
    String titre;
    int nbPages;
    Auteur auteur; // Un livre contient un objet Auteur

    // Constructeur
    public Livre(String titre, int nbPages, Auteur auteur) {
        this.titre = titre;
        this.nbPages = nbPages;
        this.auteur = auteur;
    }

    // Méthode d'affichage
    public void afficherDescription() {
        System.out.println("--- Livre ---");
        System.out.println("Titre : " + titre);
        System.out.println("Nombre de pages : " + nbPages);
        auteur.afficherDescription(); // On appelle la méthode de l'objet Auteur
    }
}
