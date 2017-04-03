/**
 * Created by TeamProjetSuiviProjet on 03/04/2017.
 */

import java.util.*;

public abstract class Personne {
    private String nom;
    private String prenom;

    public Personne(){
        this.nom = null;
        this.prenom = null;
    }

    public Personne(String n, String p){
        this.nom = n;
        this.prenom = p;
    }

    public Personne(Personne per){
        this.nom = per.nom;
        this.prenom = per.prenom;
    }

    public String getNom(){
        return this.nom;
    }

    public String getPrenom(){
        return this.prenom;
    }

    public abstract String getMail();

}