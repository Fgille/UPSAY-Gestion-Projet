/**
 * Created by pampl on 03/04/2017.
 */

import java.util.*;

public class Projet {
    private int idProjet;
    private String titre;
    private String sujet;
    private HashMap<Date, Float> listeEvals;

    public Projet(){
        this.idProjet = 0;
        this.titre = "";
        this.sujet = "";
    }

    public Projet(int idProjet, String titre, String sujet, HashMap<Date, Float> listeEvals){
        this.idProjet = idProjet;
        this.titre = titre;
        this.sujet = sujet;
        this.listeEvals = new HashMap<>();
    }

    public Projet(Projet p){
        this.idProjet = p.idProjet;
        this.titre = p.titre;
        this.sujet = p.titre;
        this.listeEvals = p.listeEvals;
    }

    public void AjouterEval(Date date){
        this.listeEvals.put(date, null);
    }

    public void RetirerEval(Date date){
        if(this.listeEvals.containsKey(date)){
            this.listeEvals.remove(date);
        }
    }
    public void setNote(Date date, float note){
        if(this.listeEvals.containsKey(date)){
            this.listeEvals.remove(date);
            this.listeEvals.put(date, note);
        }
    }

}
