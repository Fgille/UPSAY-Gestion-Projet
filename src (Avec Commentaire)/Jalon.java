/**
*
* @author TeamProjetSuiviProjet on 03/04/2017.
*
*/

import java.awt.*;
import java.io.*;
import java.util.*;
import java.lang.*;

/*
Un projet est composé d'un ensemble de jalons
 */

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
        this.listeFichiers = new ArrayList<>();
        this.note = 0.0;
        this.resume = "";

    }

    public Jalon(Date uneDate, String unResume){
        this.dateEval = uneDate;
        this.resume = unResume;
        this.listeFichiers = new ArrayList<>();
        this.note = 0.0;
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

    public void addFile(String path)
    {
        File temp = new File(path);
        this.setFichier(temp);
    }

    /*public void openFile(String path)
    {
        Desktop desk = Desktop.getDesktop();
        desk.open(new File(path));
    }*/

    @java.lang.Override
    public java.lang.String toString() {
        return "Jalon{" +
                "resume='" + resume +  "\n" +
                ", note=" + note + "\n" +
                ", dateEval=" + dateEval.toString() + "\n" +
                ", listeFichiers=" + listeFichiers.toString() + "\n" +
                '}';
    }
}