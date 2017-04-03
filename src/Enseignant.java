/**
 * Created by pampl on 03/04/2017.
 */
import java.util.*;

public class Enseignant extends Personne {

    public Enseignant(String n, String p){
        super(n,p);
    }

    public String getMail() {
        return this.getNom() + "." + this.getPrenom()+ "-professeur@univ-evry.fr";
    }

    public void consulteJalon(){

    }

    public void attribuerNoteJalon(Jalon j, float n){
        j.setNote(n);
    }
}
