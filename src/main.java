/**
 * Created by pampl on 04/05/2017.
 *
 */


import java.text.SimpleDateFormat;
import java.util.*;

public class main {
    public static void main(String [ ] args){

        System.out.println("Création et affichage élève");
        Eleve robert = new Eleve("Robert", "Pierrot");
        System.out.println(robert.toString());

        System.out.println("Création enseignant qui creer un projet et affichage professeur");
        Enseignant patrick = new Enseignant("Patrick", "Pascal");
        patrick.creerProjet(1, "Test Projet", "Refonte d'un site Intranet");
        System.out.println(patrick.toString());

        System.out.println("Création d'un groupe projet, ajout d'élèves et nommage d'un chef de projet");
        GroupeProjet gp1 = new GroupeProjet();
        Eleve flavien = new Eleve("Gille", "Flavien");
        gp1.ajouterEleve(flavien);
        gp1.ajouterEleve(robert);
        gp1.nommerChefProjet(flavien);
        System.out.println(gp1);

        System.out.println("Creation d'un projet en dur, ajout du projet au groupe projet, ajout du projet dans la liste projets de l'enseignant et affichage ");
        Projet p1 = new Projet(2,"Projet Java", "Création d'un slack");
        patrick.ajouterProjetGroupeProjet(p1, gp1);
        patrick.setListeProjets(2,p1);
        System.out.println(gp1.toString());

        System.out.println("Création d'un Jalon:");
        Date date1 = new Date(117, 0, 15);
        Jalon j1 = new Jalon(date1, "test");
        System.out.println(j1.toString());

        System.out.println("Création d'un jalon avec date, et affichage jalons pour un projet:");
        Date date = new Date(117, 4, 15);
        p1.ajouterJalon(date);
        System.out.println(p1.toString());

        System.out.println("Création d'un jalon avec date, jalon avec date et description, et affichage jalons pour un projet:");
        Date date2 = new Date(117, 3, 15);
        p1.ajouterJalon(date2, "ceci est un test");
        System.out.println(p1.toString());


        System.out.println("Suppression d'un jalon:");
        p1.retirerJalon(date2);
        System.out.println(p1.toString());

        j1.setNote(5.0);
        System.out.println(j1.toString());

        System.out.println("Enseignant consulte un jalon:");
        System.out.println(patrick.consulteJalon(p1));
    }
}
