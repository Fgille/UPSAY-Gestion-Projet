/**
 * Created by TeamProjetSuiviProjet on 03/04/2017.
 */

import java.util.*;

public class Eleve extends Personne {

    public Eleve(String n, String p) {
        super(n, p);
    }

    public String getMail(){
        return this.getNom() + "." + this.getPrenom() + "@univ-evry.fr";
    }

    public String getPrenom(){    {
        return super();
    }

    public String getNom(){
        return super();
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