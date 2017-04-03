/**
 * Created by pampl on 03/04/2017.
 */
import java.io.*;
import java.util.*;

public class Jalon {
    private float note;
    private Date dateEval;
    private ArrayList<File> listeFichiers;

    public Jalon(){
    }

    public Jalon(Date dateEval, ArrayList<File> listeFichiers){
        this.dateEval = dateEval;
        this.listeFichiers = new ArrayList<>();
    }

    public void setNote(float n){
        this.note = note;
    }
}
