/**
 * Created by TeamProjetSuiviProjet on 03/04/2017.
 */

import java.util.*;
import java.io.*;

public class Projet {
    private int idProjet;
    private String titre;
    private String sujet;
    private HashMap<Date, Jalon> listeJalon;

    public Projet(){
        this.idProjet = 0;
        this.titre = "";
        this.sujet = "";
    }

    public Projet(int idProjet, String titre, String sujet, HashMap<Date, Jalon> listeEvals){
        this.idProjet = idProjet;
        this.titre = titre;
        this.sujet = sujet;
        this.listeJalon = new HashMap<>();
    }

    public Projet(Projet p){
        this.idProjet = p.idProjet;
        this.titre = p.titre;
        this.sujet = p.titre;
        this.listeJalon = p.listeJalon;
    }

    public void ajouterEval(Date date){
        Jalon j = new Jalon(date);
        this.listeJalon.put(date, j);
    }

    public void ajouterEval(Date date, String unString){
        Jalon j = new Jalon(date, unString);
        this.listeJalon.put(date, j);
    }


    public void retirerEval(Date date){
        if(this.listeJalon.containsKey(date)){
            this.listeJalon.remove(date);
        }
    }
    public void setNote(Date date, Jalon unJalon){
        if(this.listeJalon.containsKey(date)){
            this.listeJalon.remove(date);
            this.listeJalon.put(date, unJalon);
        }
    }

    public HashMap<Date, Jalon> getListeJalon(){
        return this.listeJalon;
    }
}