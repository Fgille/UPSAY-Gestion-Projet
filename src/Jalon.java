/**
 * Created by TeamProjetSuiviProjet on 03/04/2017.
 */

import java.io.*;
import java.util.*;

public class Jalon {
    private String resume;
    private float note;
    private Date dateEval;
    private ArrayList<File> listeFichiers;

    public Jalon(){
    }

    public Jalon(String unResume, Date uneDate, ArrayList<File> listeFichiers){
        this.dateEval = uneDate;
        this.resume = unResume;
        this.listeFichiers = new ArrayList<>();
    }

    public void setNote(float n){
        this.note = note;
    }

    public String getResume() {
        return resume;
    }
}