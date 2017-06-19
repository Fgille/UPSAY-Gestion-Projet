/**
*
* @author TeamProjetSuiviProjet on 03/04/2017.
*
*/

import java.util.*;

/*
Class générique, dont "Eleve" et "Enseignant" héritent. Défini les attributs et méthodes communes aux enseignants et éléves.
 */

public abstract class Personne {
    private String nom;
    private String prenom;

    public Personne(){
        this.nom = null;
        this.prenom = null;
    }

/**
*@param n
*            defini le nom de la personne
*@param p
*            defini le prenom de la personne
*/

    public Personne(String n, String p){
        this.nom = n;
        this.prenom = p;
    }

    public Personne(Personne per){
        this.nom = per.nom;
        this.prenom = per.prenom;
    }

    /**
     *
     * @return Le nom de cette personne
     */

    public String getNom(){
        return this.nom;
    }

    /**
     *
     * @return Le prenom de cette personne
     */

    public String getPrenom(){
        return this.prenom;
    }

    public abstract String getMail();

    @java.lang.Override

    /**
     *
     * @return Affichage console
     */

    public java.lang.String toString() {
        return "Personne{" + "\n" +
                "nom='" + nom + '\'' + "\n" +
                ", prenom='" + prenom + '\'' + "\n" +
                '}';
    }
}