package echec;

public class Plateau {

    public static void main(String[] args) {
        char[][] tabPions = new char[8][8];
        remplirEspaces(tabPions, 8, 8);
        tabPions[0][2] = 'R';
        tabPions[4][7] = 'T';

        char[][] affichage = new char[(8 * 2 + 1)][(8 * 4 + 1)];
        remplirEspaces(affichage, (8 * 4 + 1), (8 * 2 + 1));

        int y = 0;
        for (char[] ligne: tabPions) {
            int x = 0;
            for (char pion: ligne) {
                peindreCase(affichage, pion, x, y);
                x++;
            }
            y++;
        }

        char[][] affichage2 = new char[(8 * 2 + 1) + 2][(8 * 4 + 1) + 4];
        remplirEspaces(affichage2, (8 * 4 + 1) + 4, (8 * 2 + 1) + 2);

        y = 0;
        for (char[] ligne: affichage) {
            int x = 0;
            for (char c: ligne) {
                affichage2[y+1][x+2] = c;
                x++;
            }
            y++;
        }

        peindreBandeauHoriz(affichage2, 0, 0);
        peindreBandeauHoriz(affichage2, 0, (8 * 2 + 1) + 1);

        printTab(affichage2);
    }

    public static void peindreBandeauHoriz(char[][] affichage, int x, int y) {
        affichage[y][x] = ' ';
        affichage[y][x+1] = ' ';
        affichage[y][x+2] = ' ';
        affichage[y][x+3] = ' ';

        for (int i = 0; i < 8; i++) {
            affichage[y][x+4+(i*4)] = (char) (65 + i);
            affichage[y][x+4+(i*4)+1] = ' ';
            affichage[y][x+4+(i*4)+2] = ' ';
            affichage[y][x+4+(i*4)+3] = ' ';
        }
    }

    public static void peindreCase(char[][] affichage, char pion, int xJeu, int yJeu) {
        int xAff = (xJeu * 4);
        int yAff = (yJeu * 2);

        affichage[yAff][xAff] = ' ';
        affichage[yAff][xAff+1] = '-';
        affichage[yAff][xAff+2] = '-';
        affichage[yAff][xAff+3] = '-';
        affichage[yAff][xAff+4] = ' ';

        affichage[yAff+1][xAff] = '|';
        affichage[yAff+1][xAff+1] = ' ';
        affichage[yAff+1][xAff+2] = pion;
        affichage[yAff+1][xAff+3] = ' ';
        affichage[yAff+1][xAff+4] = '|';

        affichage[yAff+2][xAff] = ' ';
        affichage[yAff+2][xAff+1] = '-';
        affichage[yAff+2][xAff+2] = '-';
        affichage[yAff+2][xAff+3] = '-';
        affichage[yAff+2][xAff+4] = ' ';
    }


    public static void remplirEspaces(char[][] tab, int largeur, int hauteur) {
        for (int i = 0; i < hauteur; i++) {
            tab[i] = new char[largeur];
            for (int j = 0; j < largeur; j++) {
                tab[i][j] = ' ';
            }
        }
    }


    public static void printTab(char[][] tab) {
        for (char[] line: tab) {
            for (char c: line) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}