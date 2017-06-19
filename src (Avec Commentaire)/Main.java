/**
 *
 * @author TeamProjetSuiviProjet on 03/04/2017.
 *
 */

import java.lang.reflect.Array;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args){

        // DÃ©finition des variables pour le dÃ©roulement du Main.
        Scanner sc = new Scanner(System.in);
        boolean continu = true;
        String continu2 = "O";
        boolean prof = true;
        int mem = 0;
        String mem1 = "";
        String mem2 = "";
        int memDateJour = 0;
        int memDateMois = 0;
        int memDateAnnee = 0;
        double memNote = 0.0;
        Date uneDate = new Date();
        File unFichier;
        ArrayList<Eleve> eleves= new ArrayList<>();
        ArrayList<Date> dates= new ArrayList<>();
        GroupeProjet unGroupeProjet;
        Eleve e;
        Projet p;

        // Initialisation de l'application.
        System.out.println("Bienvenue sur l'outil de Gestion de Projet Informatique. \n" +
                "Creer un profil enseignant.\n" +
                "Saisissez un nom : ");
        mem1 = sc.nextLine();
        System.out.println("Saisissez un Prenom : ");
        mem2 = sc.nextLine();
        Enseignant enseignant = new Enseignant(mem1 , mem2);
        System.out.println(enseignant.toString());

        // DÃ©but de la boucle pour le programme.
        while (continu == true)
        {
            if (prof == true)
            {
                System.out.println("Vous Ãªtes enregistrÃ© en tant qu'enseignant. Vous voulez? \n" +
                        "1  - Passer en eleve? \n" +
                        "2  - CrÃ©er un profil eleve? \n" +
                        "3  - Noter un jalon? \n" +
                        "4  - Ajouter un jalon? \n" +
                        "5  - Consulter les jalons \n" +
                        "6  - Creer un projet? \n" +
                        "7  - Creer un groupe projet? \n" +
                        "8  - Quitter l'application? \n" +
                        "9  - Retirer un jalon? \n" +
                        "10 - Afficher tout les jalons Ã  une date donnÃ©e? \n" +
                        "11 - Ajouter un eleve Ã  un groupe projet\n" +
                        "12 - Supprimer eleve groupe projet");
                mem = 0;
                mem = sc.nextInt();

                switch (mem)
                {
                    case 1:
                        System.out.println("Vous allez passer en eleve.");
                        prof = false;

                        break;

                    case 2:
                        sc.nextLine();
                        System.out.println("Vous allez crÃ©er un profil eleve. \n" +
                                "Saisissez un nom : ");
                        mem1 = sc.nextLine();
                        System.out.println("Saisissez un Prenom : ");
                        mem2 = sc.nextLine();
                        Eleve eleve = new Eleve(mem1 , mem2);
                        eleves.add(eleve);
                        System.out.println(eleve.toString());
                        break;

                    case 3:
                        sc.nextLine();
                        System.out.println("Vous allez noter un jalon.");
                        System.out.println(enseignant.toString());
                        System.out.println("Choisissez l'ID du projet auquel ajouter un jalon.");
                        mem = sc.nextInt();
                        System.out.println("Saisissez une date : \n " +
                                "jour :");
                        memDateJour = sc.nextInt()-1;
                        System.out.println("mois : ");
                        memDateMois = sc.nextInt()-1;
                        System.out.println("annee (ne peut etre anterieur Ã  1900) :");
                        memDateAnnee = sc.nextInt()-1900;
                        uneDate= new Date(memDateAnnee, memDateMois, memDateJour);
                        System.out.println("Saisissez la note");
                        memNote = sc.nextDouble();
                        enseignant.getListeProjets().get(mem).getJalon(uneDate).setNote(memNote);
                        break;

                    case 4:
                        sc.nextLine();
                        continu2 = "O";
                        System.out.println("Vous allez ajouter un jalon.");
                        System.out.println(enseignant.toString());
                        System.out.println("Choisissez l'ID du projet auquel ajouter un jalon.");
                        mem = sc.nextInt();
                        while(continu2 == "O")
                        {
                            sc.nextLine();
                            System.out.println("Saisissez une date : \n " +
                                    "jour :");
                            memDateJour = sc.nextInt();
                            System.out.println("mois : ");
                            memDateMois = sc.nextInt()-1;
                            System.out.println("annee (ne peut etre anterieur Ã  1900) :");
                            memDateAnnee = sc.nextInt()-1900;
                            uneDate= new Date(memDateAnnee, memDateMois, memDateJour);
                            dates.add(uneDate);
                            continu2=sc.nextLine();
                        }
                        enseignant.creerListeJalons(dates, enseignant.getListeProjets().get(mem));
                        break;

                    case 5:
                        System.out.println("Vous allez consulter les jalons.");
                        sc.nextLine();
                        System.out.println(enseignant.toString());
                        System.out.println("Choisissez l'ID du projet a consulter.");
                        mem = sc.nextInt();
                        System.out.println(enseignant.consulteJalon(enseignant.getListeProjets().get(mem)).toString());
                        break;

                    case 6 :
                        sc.nextLine();
                        System.out.println("Vous allez creer un projet.");
                        System.out.println("Saisissez un nom de projet :");
                        mem1 = sc.nextLine();
                        System.out.println("Saisissez un sujet de projet :");
                        mem2 = sc.nextLine();
                        enseignant.creerProjet(enseignant.getListeProjets().size(), mem1, mem2);
                        System.out.println(enseignant.toString());
                        break;

                    case 7 :
                        sc.nextLine();
                        System.out.println("Vous allez creer un groupe projet");
                        unGroupeProjet = new GroupeProjet();
                        System.out.println(enseignant.toString());
                        System.out.println("Choisissez l'ID du projet auquel affecter un groupe projet.");
                        mem = sc.nextInt();
                        enseignant.ajouterProjetGroupeProjet(enseignant.getListeProjets().get(mem), unGroupeProjet);
                        break;

                    case 8:
                        System.out.println("Vous allez quitter l'application.");
                        continu = false;

                        break;

                    case 9 :
                        System.out.println("Vous allez retirer un jalon.");
                        sc.nextLine();
                        System.out.println(enseignant.toString());
                        System.out.println("Choisissez l'ID du projet auquel retirer un jalon.");
                        mem = sc.nextInt();
                        System.out.println("Saisissez une date : \n " +
                                "jour :");
                        memDateJour = sc.nextInt();
                        System.out.println("mois : ");
                        memDateMois = sc.nextInt()-1;
                        System.out.println("annee (ne peut etre anterieur Ã  1900) :");
                        memDateAnnee = sc.nextInt()-1900;
                        uneDate= new Date(memDateAnnee, memDateMois, memDateJour);
                        enseignant.getListeProjets().get(mem).retirerJalon(uneDate);
                        break;


                    case 10 :
                        sc.nextLine();
                        System.out.println("Saisissez une date : \n " +
                                "jour :");
                        memDateJour = sc.nextInt();
                        System.out.println("mois : ");
                        memDateMois = sc.nextInt()-1;
                        System.out.println("annee (ne peut etre anterieur Ã  1900) :");
                        memDateAnnee = sc.nextInt()-1900;
                        uneDate= new Date(memDateAnnee, memDateMois, memDateJour);
                        System.out.println(enseignant.afficherListeProjetParDateJalon(uneDate).toString());
                        break;

                    case 11 :
                        System.out.println("Vous allez ajouter un eleve Ã  un groupeprojet.");
                        sc.nextLine();
                        System.out.println("Choisissez l'eleve Ã  ajouter dans le projet.");
                        System.out.println(eleves.toString());
                        mem = sc.nextInt();
                        e = eleves.get(mem);
                        System.out.println("Veuillez saisir l'id de votre projet");
                        System.out.println(enseignant.getListeProjets());
                        //sc.nextLine();
                        mem = sc.nextInt();
                        p = enseignant.getListeProjets().get(mem);
                        p.getUnGroupeProjet().ajouterEleve(e);
                        System.out.println("Souhaitez-vous qu'il soit nommer chef de groupe? 1 = Oui/ 2 = Non");
                        mem = sc.nextInt();
                        if(p.getUnGroupeProjet().getChefProjet() == null){
                            if(mem == 1){
                                p.getUnGroupeProjet().nommerChefProjet(e);
                                System.out.println(p.getUnGroupeProjet().toString());
                            }
                        }
                        break;

                    case 12 :
                        System.out.println("Vous allez supprimer un eleve Ã  un groupeprojet.");
                        sc.nextLine();
                        System.out.println("Choisissez l'eleve Ã  supprimer dans le projet.");
                        System.out.println(eleves.toString());
                        mem = sc.nextInt();
                        e = eleves.get(mem);
                        System.out.println("Veuillez saisir l'id de votre projet");
                        System.out.println(enseignant.getListeProjets());
                        //sc.nextLine();
                        mem = sc.nextInt();
                        p = enseignant.getListeProjets().get(mem);
                        p.getUnGroupeProjet().supprimerEleve(e);
                        break;


                    default:
                        System.out.println("Saisi incorrect.");

                }
            }
            else
            {
                sc.nextLine();
                System.out.println("Choisissez un profil eleve.\n" +
                        eleves.toString());
                mem = sc.nextInt();
                e = eleves.get(mem);
                System.out.println("vous etes connecter en tant que : " + e.toString());

                System.out.println("Vous Ãªtes enregistrÃ© en tant qu'eleve. Vous voulez? \n" +
                        "1 - Passer en enseignant? \n" +
                        "2 - CrÃ©er un profil eleve? \n" +
                        "3 - Remplir un jalon? \n" +
                        "4 - Consulter les jalons? \n" +
                        "5 - Quitter l'application?");
                mem = 0;
                mem = sc.nextInt();

                switch (mem)
                {
                    case 1:
                        System.out.println("Vous allez passer en enseignant.");
                        prof = true;
                        break;

                    case 2:
                        sc.nextLine();
                        System.out.println("Vous allez crÃ©er un profil eleve. \n" +
                                "Saisissez un nom : ");
                        mem1 = sc.nextLine();
                        System.out.println("Saisissez un Prenom : ");
                        mem2 = sc.nextLine();
                        Eleve eleve = new Eleve(mem1 , mem2);
                        eleves.add(eleve);
                        System.out.println(eleve.toString());
                        break;

                    case 3:
                        sc.nextLine();
                        System.out.println("Vous allez remplir un jalon.");
                        System.out.println("Saisissez une date : \n " +
                                "jour :");
                        memDateJour = sc.nextInt();
                        System.out.println("mois : ");
                        memDateMois = sc.nextInt()-1;
                        System.out.println("annee (ne peut etre anterieur Ã  1900) :");
                        memDateAnnee = sc.nextInt()-1900;
                        uneDate= new Date(memDateAnnee, memDateMois, memDateJour);

                        System.out.println("Saisissez le nom de votre fichier (chemin relatif)");
                        mem1 = sc.nextLine();
                        unFichier = new File(mem1);
                        e.getUnGroupeProjet().ajouterFichierJalon(e.getUnGroupeProjet().getProjet().getJalon(uneDate), unFichier);

                        System.out.println("Vous avez ajouter un fichier au jalon");
                        break;

                    case 4:
                        System.out.println("vous aller consulter les jalons.");
                        e.getUnGroupeProjet().getProjet().getListeJalons().toString();
                        break;

                    case 5:
                        System.out.println("Vous allez quitter l'application.");
                        continu = false;

                        break;

                    default:
                        System.out.println("Saisi incorrect.");

                }
            }
        }

        /*
        System.out.println("CrÃ©ation et affichage Ã©lÃ¨ve");
        Eleve robert = new Eleve("Robert", "Pierrot");
        System.out.println(robert.toString());

        System.out.println("CrÃ©ation enseignant qui creer un projet et affichage professeur");
        Enseignant patrick = new Enseignant("Jean", "Patrick");
        patrick.creerProjet(1, "test", "lalalalalal");
        System.out.println(patrick.toString());

        System.out.println("CrÃ©ation d'un groupe projet, ajout d'Ã©lÃ¨ves et nommage d'un chef de projet");
        GroupeProjet gp1 = new GroupeProjet();
        Eleve flavien = new Eleve("Gille", "Flavien");
        gp1.ajouterEleve(flavien);
        gp1.ajouterEleve(robert);
        gp1.nommerChefProjet(flavien);
        System.out.println(gp1);

        System.out.println("Creation d'un projet en dur, ajout du projet au groupe projet, ajout du projet dans la liste projets de l'enseignant et affichage ");
        Projet p1 = new Projet(2,"Projet Java", "CrÃ©ation d'un slack");
        patrick.ajouterProjetGroupeProjet(p1, gp1);
        patrick.setListeProjets(p1);
        System.out.println(gp1.toString());

        System.out.println("CrÃ©ation d'un Jalon:");
        Date date1 = new Date(117, 0, 15);
        Jalon j1 = new Jalon(date1, "test");
        System.out.println(j1.toString());

        System.out.println("CrÃ©ation d'un jalon avec date, et affichage jalons pour un projet:");
        Date date = new Date(117, 4, 15);
        p1.ajouterJalon(date);
        System.out.println(p1.toString());

        System.out.println("CrÃ©ation d'un jalon avec date, jalon avec date et description, et affichage jalons pour un projet:");
        Date date2 = new Date(117, 3, 15);
        p1.ajouterJalon(date2, "ceci est un test");
        System.out.println(p1.toString());

        System.out.println("Suppression d'un jalon:");
        p1.retirerJalon(date2);
        System.out.println(p1.toString());
        j1.setNote(5.0);
        System.out.println(j1.toString());

        System.out.println("Enseignant consulte un jalon:");
        System.out.println(patrick.consulteJalon(p1)); */
    }
}
