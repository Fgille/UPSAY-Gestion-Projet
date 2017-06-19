/**
*
* @author TeamProjetSuiviProjet on 03/04/2017.
*
*/

import java.lang.reflect.Array;
import java.util.*;
import java.io.*;

/*
Class héritée de "Personne", permet de définir l'enseignant. L'enseignant pourra:
- Ajouter des jalons
- Consulter les jalons
- Afficher la liste des projets
 */

public class Enseignant extends Personne {
    private ArrayList<Projet> listeProjets;

    /**
     * @see Personne
     *
     */

    public Enseignant(String n, String p){
        super(n,p);
        this.listeProjets = new ArrayList<>();
    }

    /**
     *
     * @return nom.prenom-professeur@univ-evry.fr (mail prof)
     */

    public String getMail() {
        return this.getNom() + "." + this.getPrenom()+ "-professeur@univ-evry.fr";
    }

    public ArrayList<Projet> getListeProjets() {
        return listeProjets;
    }

    public HashMap<Date, Jalon> consulteJalon(Projet p){
        return p.getListeJalons();
    }

    public void noterJalon(Jalon j, double note){
        j.setNote(note);
    }

    /**
     * Enseignant va créer le Projet
     * @see Projet
     *@param idProjet
     * @param titre
     * @param sujet
     *
     */

    public void creerProjet(int idProjet, String titre, String sujet){
        Projet p = new Projet(idProjet, titre, sujet);
        this.listeProjets.add(p);
    }

    /**
     * Ajoute le projet à la liste des projets
     * @param p
     */

    public void setListeProjets(Projet p){
        this.listeProjets.add(p);
    }

    /**
     * @see Projet
     * @param listeDates permet d'ajouter une liste de jalon à ma liste de jalons déjà existante
     * @param p
     */

    public void creerListeJalons(ArrayList<Date> listeDates, Projet p){
        for(int i = 0; i<listeDates.size(); i++){
            p.ajouterJalon(listeDates.get(i));
        }
    }

// Va générer une liste des projets ordonnées par leur date de Jalons 

    public ArrayList<Projet> afficherListeProjetParDateJalon(Date uneDate){
        ArrayList<Projet> listeProjets2 = new ArrayList<>();
       //En tournant dans la hash set de jalons, si la clé est égale à ce qu'on veut, on insère le projet dans l'arraylist
        for(Projet p : this.listeProjets){
            if(p.getListeJalons() != null){
                if(p.getJalon(uneDate) != null){
                    listeProjets2.add(p);
                }
            }
        }
        return listeProjets2;
    }

    public ArrayList<File> consulterFichiersJalon(Jalon j){
        return j.getFichier();
    }

    public void ajouterProjetGroupeProjet(Projet p, GroupeProjet gp){
        gp.setProjet(p);
    }

    @java.lang.Override

    /**
     *
     * @return Affichage console
     */

    public java.lang.String toString() {
        return "Enseignant{" + "\n" +
                "Prenom=" + getPrenom() + "\n" +
                "Nom=" + getNom() + "\n" +
                "Mail=" + getMail() + "\n" +
                "listeProjets=" + listeProjets.toString() + "\n" +
                '}';
    }
}