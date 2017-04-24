/**
 * Created by TeamProjetSuiviProjet on 03/04/2017.
 */

import java.util.*;
import java.io.*;

public class Projet {
    private int idProjet;
    private String titre;
    private String sujet;
    private HashMap<Date, Jalon> listeJalons;

    public Projet(){
        this.idProjet = 0;
        this.titre = "";
        this.sujet = "";
    }

    public Projet(int idProjet, String titre, String sujet, HashMap<Date, Jalon> listeJalons){
        this.idProjet = idProjet;
        this.titre = titre;
        this.sujet = sujet;
        this.listeJalons = new HashMap<>();
    }

    public Projet(Projet p){
        this.idProjet = p.idProjet;
        this.titre = p.titre;
        this.sujet = p.titre;
        this.listeJalons = p.listeJalons;
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

    public HashMap<Date, Jalon> getListeJalons(){
        return this.listeJalons;
    }
}