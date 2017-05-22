/**
 * Created by TeamProjetSuiviProjet on 2017.
 */

import java.util.*;

public class Eleve extends Personne {

    public Eleve(String n, String p) {
        super(n, p);
    }

    public String getMail(){
        return this.getNom() + "." + this.getPrenom() + "@univ-evry.fr";
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Eleve{" + "\n" +
                "Prenom=" + getPrenom() + "\n" +
                "Nom=" + getNom() + "\n" +
                "Mail=" + getMail() + "\n" +
                "}";
    }
}