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

    ArrayList<Livre> livres;

    public Bibli() {
        livres = new ArrayList<Livre>();
    }

    public void ajouterLivre(Livre livre) {
        livres.add(livre);
    }

    public void afficherLivres() {
        System.out.println("=== Bibliothèque ===");
        for (Livre l : livres) {
            l.afficherDescription();
            System.out.println();
        }
    }
}
