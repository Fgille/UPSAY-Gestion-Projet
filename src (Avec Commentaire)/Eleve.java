/**
*
* @author TeamProjetSuiviProjet on 03/04/2017.
*
*/

import java.util.*;

/*
Class héritée de "Personne". Permet de définir les éléves et de leur attribuer un groupe projet
 */

public class Eleve extends Personne {
    private GroupeProjet unGroupeProjet;

    /**
     * @see Personne
     * @param n
     * @param p
     */

    public Eleve(String n, String p) {
        super(n, p);
    }

    public void setUnGroupeProjet(GroupeProjet unGroupeProjet) {
        this.unGroupeProjet = unGroupeProjet;
    }

    /**
     *
     * @return le GroupeProjet de l'éléve
     */

    public GroupeProjet getUnGroupeProjet() {
        return unGroupeProjet;
    }

    /**
     *
     * @return nom.prenom@univ-evry. (mail eleve)
     */

    public String getMail(){
        return this.getNom() + "." + this.getPrenom() + "@univ-evry.fr";
    }

    @java.lang.Override

    /**
     *
     * @return Affichage console
     */

    public java.lang.String toString() {
        return "Eleve{" + "\n" +
                "Prenom=" + getPrenom() + "\n" +
                "Nom=" + getNom() + "\n" +
                "Mail=" + getMail() + "\n" +
                "}";
    }
}