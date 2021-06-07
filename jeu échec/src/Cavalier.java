public class Cavalier extends Piece {
    public Cavalier(char couleur) {
        super('c', couleur) ;
    }

public boolean isValid(int xOrig, int yOrig, int xDest, int yDest) {
    boolean valid = false ;
    int calcul = (xDest-xOrig)(xDest-xOrig)+(yDest-yOrig)(yDest-yDest) ;
    if (calcul=5) {
        valid = true ;
        }

    return valid ;
    }

}