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

    String titre;
    int nbPages;
    Auteur auteur;

    public Livre(String titre, int nbPages, Auteur auteur) {
        this.titre = titre;
        this.nbPages = nbPages;
        this.auteur = auteur;
    }

    public void afficherDescription() {
        System.out.println("--- Livre ---");
        System.out.println("Titre : " + titre);
        System.out.println("Nombre de pages : " + nbPages);
        auteur.afficherDescription();
    }
}
