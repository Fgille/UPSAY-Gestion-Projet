/**
 * Created by pampl on 03/04/2017.
 */
public class Filiere {
    private String nom;

    public Filiere(){
    }

    public Filiere(String unNom){
        this.nom = unNom;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Filiere{" + "\n" +
                "nom='" + nom +  "\n" +
                '}';
    }
}