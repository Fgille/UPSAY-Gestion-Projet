/**
*
* @author TeamProjetSuiviProjet on 03/04/2017.
*
*/

import java.util.*;
import java.io.*;

/*
Class "Projet", définie par un ID, un titre et un sujet.
Ce projet est composé de Jalons.
*/

public class Projet {
    /**
    * L'id du projet. Cet id n'est pas modifiable et est unique.
    *
    * @see Projet#Projet(int, String, double )
    *
    */
    private int idProjet;
    private String titre;
    private String sujet;
    private HashMap<Date, Jalon> listeJalons;
    private double moyenne;
    private GroupeProjet unGroupeProjet;

/*
*
*@see GroupeProjet
*
*/

    public Projet(){
        this.idProjet = 0;
        this.titre = "";
        this.sujet = "";
        unGroupeProjet = new GroupeProjet();
    }

    public Projet(int idProjet, String titre, String sujet){
        this.idProjet = idProjet;
        this.titre = titre;
        this.sujet = sujet;
        this.listeJalons = new HashMap<>();
        unGroupeProjet = new GroupeProjet();
    }

    public Projet(Projet p){
        this.idProjet = p.idProjet;
        this.titre = p.titre;
        this.sujet = p.titre;
        this.listeJalons = p.listeJalons;
        this.unGroupeProjet=p.unGroupeProjet;
    }
/**
*
* @return Le groupe de projet
*/

    public GroupeProjet getUnGroupeProjet() {
        return unGroupeProjet;
    }

    public void ajouterJalon(Date date){
        Jalon j = new Jalon(date);
        this.listeJalons.put(date, j);
    }

    public void ajouterJalon(Date date, String unString){
        Jalon j = new Jalon(date, unString);
        this.listeJalons.put(date, j);
    }


    public void retirerJalon(Date date){
        if(this.listeJalons.containsKey(date)){
            this.listeJalons.remove(date);
        }
    }
    public void setNote(Date date, Jalon unJalon){
        if(this.listeJalons.containsKey(date)){
            this.listeJalons.remove(date);
            this.listeJalons.put(date, unJalon);
        }
    }

    public Jalon getJalon(Date uneDate){
        return this.getListeJalons().get(uneDate);
    }

    public HashMap<Date, Jalon> getListeJalons(){
        return this.listeJalons;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Projet{" +
                "idProjet=" + idProjet + "\n" +
                ", titre='" + titre + "\n" +
                ", sujet='" + sujet + "\n" +
                ", listeJalons=" + listeJalons.toString() + "\n" +
                '}';
    }
}