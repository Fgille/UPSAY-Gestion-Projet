/**
*
* @author TeamProjetSuiviProjet on 03/04/2017.
*
*/

import java.util.*;
import java.io.*;

/*
Class GroupeProjet, un ensemble d'éléves réalisent un projet. La variable chef de projet va permettre de désigner quelle
personne va remplir les jalons.
 */

public class GroupeProjet{
    private Eleve chefProjet;
    private HashSet<Eleve> listeEleves;
    private Projet unProjet;

    public GroupeProjet(){
        this.listeEleves = new HashSet<>();
    }

    public void ajouterEleve(Eleve e){
        this.listeEleves.add(e);
        e.setUnGroupeProjet(this);
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
        return this.unProjet.getListeJalons().get(uneDate);
    }

    public Projet getProjet(){
        return this.unProjet;
    }

    public void setProjet(Projet p){
        this.unProjet =p;
    }

    public ArrayList<File> consulterFichiersJalon(Jalon j){
        return j.getFichier();
    }

    public void ajouterFichierJalon(Jalon j, File fichier){
        j.setFichier(fichier);
    }

    public void ajouterFichierJalon(Jalon j, ArrayList<File> fichiers){
        for(int i=0; i<fichiers.size(); i++)
        {
            this.ajouterFichierJalon(j, fichiers.get(i));
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GroupeProjet)) return false;

        GroupeProjet that = (GroupeProjet) o;

        if (!chefProjet.equals(that.chefProjet)) return false;
        if (!listeEleves.equals(that.listeEleves)) return false;
        return unProjet.equals(that.unProjet);
    }

    @Override
    public int hashCode() {
        int result = chefProjet.hashCode();
        result = 31 * result + listeEleves.hashCode();
        result = 31 * result + unProjet.hashCode();
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "GroupeProjet{" + "\n" +
                "chefProjet=" + chefProjet.getNom() + "" + chefProjet.getPrenom() + "\n" +
                ", listeEleves=" + listeEleves.toString() + "\n" +
                ", unProjet=" + unProjet + "\n" +
                '}';
    }

    public Eleve getChefProjet() {
        return chefProjet;
    }

}