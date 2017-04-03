/**
 * Created by pampl on 03/04/2017.
 */
import java.util.*;

public class GroupeProjet{
    private Eleve chefProjet;
    private HashSet<Eleve> listeEleves;

    public GroupeProjet(){
        this.listeEleves = new HashSet<>();
    }

    public void AjouterEleve(Eleve e){
        this.listeEleves.add(e);
    }

    public void SupprimerEleve(Eleve e){
        this.listeEleves.remove(e);
    }

    public void AjouterEleves(HashSet<Eleve> list){
        this.listeEleves = list;
    }

    public void nommerChefProjet(Eleve e){
        if(!this.listeEleves.isEmpty()){
            if (this.listeEleves.contains(e))
                this.chefProjet = e;
        }
    }

    public void consulteJalon(){

    }
}
