package echec;

public enum Couleur {
    BLACK ("BLACK"),
    WHITE ("WHITE");
    Couleur(String s){description = s;}
    private String description;
    public String getDescription() {return description;}

}
