/**
 * Created by TeamProjetSuiviProjet on 03/04/2017.
 */

import java.lang.reflect.Array;
import java.util.*;
import java.io.*;

public class Enseignant extends Personne {
    private ArrayList<Projet> listeProjets;

    public Enseignant(String n, String p){
        super(n,p);
    }

    public String getMail() {
        return this.getNom() + "." + this.getPrenom()+ "-professeur@univ-evry.fr";
    }

    public HashMap<Date, Jalon> consulteJalon(Projet p){
        return p.getListeJalons();
    }

    public void noterJalon(Jalon j, float note){
        j.setNote(note);
    }

    public void creerProjet(int idProjet, String titre, String sujet, HashMap<Date, Jalon> listeJalons){
        Projet p = new Projet(idProjet, titre, sujet, listeJalons);
        this.listeProjets.add(p);
    }

    public void creerListeJalons(ArrayList<Date> listeDates, Projet p){
        for(int i = 0; i<listeDates.size(); i++){
            p.ajouterJalon(listeDates.get(i));
        }
    }

    public ArrayList<File> consulterFichiersJalon(Jalon j){
        return j.getFichier();
    }

    public String getPrenom(){    {
        return super();
    }

    public String getNom(){
        return super();
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Enseignant{" + "\n" +
                "Prenom=" + getPrenom() + "\n" +
                "Nom=" + getNom() + "\n" +
                "Mail=" + getMail() + "\n" +
                "listeProjets=" + listeProjets.toString() + "\n" +
                '}';
    }
}