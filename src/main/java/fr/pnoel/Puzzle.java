package fr.pnoel;

public class Puzzle {
    public boolean piecePosable(int[][] puzzleBoard, int[][] piece) {
        boolean possible = false;

        for (int numLigne = 0; numLigne < puzzleBoard.length ; numLigne++) {
            int[] line = puzzleBoard[numLigne];
            for (int numColonne = 0; numColonne < line.length ; numColonne++) {
                int[][] sousTableau = sousTableau(puzzleBoard, piece.length, piece[0].length, numLigne, numColonne);
                if(sousTableau != null){
                    possible = piecePosableAtPlace(sousTableau, piece);
                }
                if (possible) {
                    break;
                }
            }
            if (possible) {
                break;
            }
        }
        return possible;
    }

    private boolean piecePosableAtPlace(int[][] sousTableau, int[][] piece){
        boolean possible = true;
        for (int numLigne = 0; numLigne < sousTableau.length ; numLigne++) {
            int[] ligne = sousTableau[numLigne];
            for (int numColonne = 0; numColonne < ligne.length ; numColonne++) {
                if(sousTableau[numLigne][numColonne] == 1 && piece[numLigne][numColonne] == 1){
                    possible = false;
                    break;
                }
            }
            if (!possible){
                break;
            }

        }
        return possible;
    }

    public int[][] sousTableau(int[][] oTableau, int hauteur, int largeur, int ligneDepart, int colonneDepart) {
        int[][] resultat = new int[hauteur][largeur];
        if (oTableau.length < hauteur + colonneDepart || (oTableau.length > 0 && oTableau[0].length < largeur + ligneDepart)){
            return null;
        }
        for (int i = 0; i < hauteur; i++) {
            System.arraycopy(oTableau[i + colonneDepart], ligneDepart, resultat[i], 0, largeur);

        }
        return resultat;
    }

}
