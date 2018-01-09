package fr.pnoel;

public class BatailleNavale {
    public int ifSuccess (int[][] board){
        int success = 0;
        for (int i = 0; i <board.length ; i++) {
            if (board[0][0] == 1){
                success = 1;
            }
        }
        return success;
    }
}
