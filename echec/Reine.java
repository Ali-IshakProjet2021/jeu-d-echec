package echec;

import java.util.ArrayList;
import java.util.List;

public class Reine extends Piece implements Mouvement{

    public Reine(int x, int y, Couleur c) {
        super(x, y, c);
      
    }
    public
    List<Position> getMouvementPossible() {  
        List<Position> mouvementPossible = new ArrayList<Position>();
        int x=position.getX();
        int y=position.getY();
        Fou ftemp = new Fou(x,y,couleur,false);
        Tour Ttemp = new Tour(x,y,couleur, false); 

        mouvementPossible.addAll(ftemp.getMouvementPossible());
        mouvementPossible.addAll(Ttemp.getMouvementPossible());




        return mouvementPossible;
    }



   
    public String toString() {
        
        return "[Reine "+super.position.getX()+","+super.position.getY()+"]" ;
    }}


