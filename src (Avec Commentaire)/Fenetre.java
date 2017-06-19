/**
*
* @author TeamProjetSuiviProjet on 23/05/2017.
*
*/

import javax.swing.*;
import java.awt.Color;

public class Fenetre extends JFrame {
  public Fenetre(){
      JFrame fenetre = new JFrame();
      JPanel panelPrincipal = new JPanel();

      fenetre.setTitle("Gestion de projet informatique");
      this.setSize(400, 400);
      fenetre.setLocationRelativeTo(null);

      JButton bouton1 = new JButton("Test Bouton ");
      panelPrincipal.setBackground(Color.ORANGE);

      panelPrincipal.add(bouton1);
      this.setContentPane(panelPrincipal);
      this.setVisible(true);
      fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  }
}
