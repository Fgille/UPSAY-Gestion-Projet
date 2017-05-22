/**
 * Created by TeamProjetSuiviProjet on 2017.
 */

import java.io.*;
import java.util.*;

public class Jalon {
    private String resume;
    private double note;
    private Date dateEval;
    private ArrayList<File> listeFichiers;

    public Jalon(){
    }

    public Jalon(Date uneDate)
    {
        this.dateEval = uneDate;
    }

    public Jalon(Date uneDate, String unResume){
        this.dateEval = uneDate;
        this.resume = unResume;
        this.note = 0;
    }

    public Jalon(String unResume, Date uneDate, ArrayList<File> listeFichiers){
        this.dateEval = uneDate;
        this.resume = unResume;
        this.listeFichiers = new ArrayList<>();
        this.note = 0;
    }

    public void setNote(double n){
        this.note = n;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String unResume)
    {
        this.resume = unResume;
    }

    public ArrayList<File> getFichier() {
        return this.listeFichiers;
    }

    public void setFichier(File fichier)
    {
        this.listeFichiers.add(fichier);
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Jalon{" +
                "resume='" + resume +  "\n" +
                ", note=" + note + "\n" +
                ", dateEval=" + dateEval.toString() + "\n" +
                //", listeFichiers=" + listeFichiers.toString() + "\n" +
                '}';
    }
}