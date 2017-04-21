/**
 * Created by TeamProjetSuiviProjet on 03/04/2017.
 */

import java.util.*;
import java.io.*;

public class GroupeProjet{
    private Eleve chefProjet;
    private HashSet<Eleve> listeEleves;
    private Projet unProjet;

    public GroupeProjet(){
        this.listeEleves = new HashSet<>();
    }

    public void ajouterEleve(Eleve e){
        this.listeEleves.add(e);
    }

    public void supprimerEleve(Eleve e){
        this.listeEleves.remove(e);
    }

    public void ajouterEleves(HashSet<Eleve> list){
        this.listeEleves = list;
    }

    public void nommerChefProjet(Eleve e){
        if(!this.listeEleves.isEmpty()){
            if (this.listeEleves.contains(e))
                this.chefProjet = e;
        }
    }

    public void realiseJalon(String unString, Jalon unJalon){
        unJalon.setResume(unString);
    }

    public Jalon getJalon(Date uneDate)
    {
        return this.unProjet.getListeJalon().get(uneDate);
    }
}