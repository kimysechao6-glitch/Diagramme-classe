/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diag.classes;

/**
 *
 * @author Kimy
 */
public class Auteur {

    String nom;
    String prenom;
    int anneeNaissance;

    public Auteur(String nom, String prenom, int anneeNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.anneeNaissance = anneeNaissance;
    }

    public void afficherDescription() {
        System.out.println("Auteur : " + prenom + " " + nom);
        System.out.println("Année de naissance : " + anneeNaissance);
    }
}
