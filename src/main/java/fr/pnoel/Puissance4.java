package fr.pnoel;

public class Puissance4 {

    public int whowon(int[][] board) {
        int winner = getHorizontalWinner(board, 3);
        if (winner == 0) {
            winner = getHorizontalWinner(transposeBoard(board), 2);
        }
        return winner;
    }

    private int getHorizontalWinner(int[][] board, int maxIndex) {
        int winner = 0;
        for (int[] line : board) {
            if (winner == 0) {
                winner = getWinnerOnRow(line, maxIndex);
            }
        }
        return winner;
    }

    private int getWinnerOnRow(int[] row, int maxIndex) {
        int winner = 0;
        for (int i = 0; i <= maxIndex; i++) {
            if (winner == 0) {
                winner = getWinnerOnRowAtIndex(row, i);
            }
        }
        return winner;
    }

    private int getWinnerOnRowAtIndex(int[] line, int i) {
        int winner = 0;
        if (line[i] != 0 && line[i] == line[i + 1] && line[i + 1] == line[i + 2] && line[i + 2] == line[i + 3]) {
            winner = line[i];
        }
        return winner;
    }

    private int[][] transposeBoard(int[][] board) {
        int nbRows = board.length;
        int nbColumns = board[0].length;
        int[][] columns = new int[nbColumns][nbRows];

        for (int i = 0; i < nbRows; i++) {
            for (int j = 0; j < nbColumns; j++) {
                columns[j][i] = board[i][j];
            }
        }
        return columns;
    }

    private void printBoard(int[][] columns) {
        for (int[] column : columns) {
            printRow(column);
            System.out.println();
        }
    }

    private void printRow(int[] ints) {
        for (int anInt : ints) {
            System.out.print(anInt + " ");
        }
    }

}
