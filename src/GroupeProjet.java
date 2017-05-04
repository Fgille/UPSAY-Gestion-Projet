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
        return this.unProjet.getListeJalons().get(uneDate);
    }

    public Projet getProjet(){
        return this.unProjet;
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

    @java.lang.Override
    public java.lang.String toString() {
        return "GroupeProjet{" + "\n" +
                "chefProjet=" + chefProjet + "\n" +
                ", listeEleves=" + listeEleves.toString() + "\n" +
                ", unProjet=" + unProjet + "\n" +
                '}';
    }
}