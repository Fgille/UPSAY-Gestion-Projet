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
}