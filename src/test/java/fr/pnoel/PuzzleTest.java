package fr.pnoel;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class PuzzleTest {
    @Test
    public void shouldReturn1WhenPuzzleIsEmptyForPiece1x1(){
        //Given
        Puzzle puzzle = new Puzzle();
        int[][] puzzleBoard =
                 {{0,0,0,0,0,0,0,0,0,0}
                , {0,0,0,0,0,0,0,0,0,0}
                , {0,0,0,0,0,0,0,0,0,0}
                , {0,0,0,0,0,0,0,0,0,0}
                , {0,0,0,0,0,0,0,0,0,0}
                , {0,0,0,0,0,0,0,0,0,0}
                , {0,0,0,0,0,0,0,0,0,0}
                , {0,0,0,0,0,0,0,0,0,0}
                , {0,0,0,0,0,0,0,0,0,0}
                , {0,0,0,0,0,0,0,0,0,0}};
        int[][] piece =
                 {{1}};
        //When
        boolean piecePosable = puzzle.piecePosable(puzzleBoard, piece);

        // Then
        Assertions.assertThat(piecePosable).isTrue();
    }

    @Test
    public void shouldReturn0WhenPuzzleIsFullForPiece1X1(){
        //Given
        Puzzle puzzle = new Puzzle();
        int[][] puzzleBoard =
                         {{1,1,1,1,1,1,1,1,1,1}
                        , {1,1,1,1,1,1,1,1,1,1}
                        , {1,1,1,1,1,1,1,1,1,1}
                        , {1,1,1,1,1,1,1,1,1,1}
                        , {1,1,1,1,1,1,1,1,1,1}
                        , {1,1,1,1,1,1,1,1,1,1}
                        , {1,1,1,1,1,1,1,1,1,1}
                        , {1,1,1,1,1,1,1,1,1,1}
                        , {1,1,1,1,1,1,1,1,1,1}
                        , {1,1,1,1,1,1,1,1,1,1}};
        int[][] piece =
                        {{1}};

        //When
        boolean piecePosable = puzzle.piecePosable(puzzleBoard, piece);

        //Then
        Assertions.assertThat(piecePosable).isFalse()
        ;
    }


    @Test
    public void shouldReturn1WhenPuzzleHaveOneSoluceForPiece1X1(){
        //Given
        Puzzle puzzle = new Puzzle();
        int[][] puzzleBoard =
                         {{1,1,1,0,1,1,1,1,1,1}
                        , {1,1,1,1,1,1,1,1,1,1}
                        , {1,1,1,1,1,1,1,1,1,1}
                        , {1,1,1,1,1,1,1,1,1,1}
                        , {1,1,1,1,1,1,1,1,1,1}
                        , {1,1,1,1,1,1,1,1,1,1}
                        , {1,1,1,1,1,1,1,1,1,1}
                        , {1,1,1,1,1,1,1,1,1,1}
                        , {1,1,1,1,1,1,1,1,1,1}
                        , {1,1,1,1,1,1,1,1,1,1}};
        int[][] piece =
                {{1}};

        //When
        boolean piecePosable = puzzle.piecePosable(puzzleBoard, piece);

        //Then
        Assertions.assertThat(piecePosable).isTrue();
    }


    @Test
    public void shouldReturnFalseWhenPuzzleHaveNoSoluceForPiece1X2(){
        //Given
        Puzzle puzzle = new Puzzle();
        int[][] puzzleBoard =
                         {{1,1,1,0,1,1,1,1,1,1}
                        , {1,1,1,1,1,1,1,1,1,1}
                        , {1,1,1,1,1,1,1,1,1,1}
                        , {1,1,1,1,1,1,1,1,1,1}
                        , {1,1,1,1,1,1,1,1,1,1}
                        , {1,1,1,1,1,1,1,1,1,1}
                        , {1,1,1,1,1,1,1,1,1,1}
                        , {1,1,1,1,1,1,1,1,1,1}
                        , {1,1,1,1,1,1,1,1,1,1}
                        , {1,1,1,1,1,1,1,1,1,1}};
        int[][] piece =
                {{1},{1}};

        //When
        boolean piecePosable = puzzle.piecePosable(puzzleBoard, piece);

        //Then
        Assertions.assertThat(piecePosable).isFalse();
    }

    @Test
    public void shouldReturnTrueWhenPuzzleHaveSoluceForPiece1X2(){
        //Given
        Puzzle puzzle = new Puzzle();
        int[][] puzzleBoard =
                         {{1,1,1,0,1,1,1,1,1,1}
                        , {1,1,1,0,1,1,1,1,1,1}
                        , {1,1,1,1,1,1,1,1,1,1}
                        , {1,1,1,1,1,1,1,1,1,1}
                        , {1,1,1,1,1,1,1,1,1,1}
                        , {1,1,1,1,1,1,1,1,1,1}
                        , {1,1,1,1,1,1,1,1,1,1}
                        , {1,1,1,1,1,1,1,1,1,1}
                        , {1,1,1,1,1,1,1,1,1,1}
                        , {1,1,1,1,1,1,1,1,1,1}};
        int[][] piece =
                {{1},{1}};

        //When
        boolean piecePosable = puzzle.piecePosable(puzzleBoard, piece);

        //Then
        Assertions.assertThat(piecePosable).isTrue();
    }

    @Test
    public void shouldReturnEmptyTab(){
        //Given
        Puzzle puzzle = new Puzzle();
        int[][] oTableau = {};

        //When
        int[][] tab = puzzle.sousTableau(oTableau, 0,0, 0, 0);

        //Then
        Assertions.assertThat(tab).isEqualTo(new int [][] {});
    }

    @Test
    public void shouldReturnNull(){
        //Given
        Puzzle puzzle = new Puzzle();
        int[][] oTableau = {
                {},
                {}};

        //When
        int[][] tab = puzzle.sousTableau(oTableau, 1,2, 0, 0);

        //Then
        Assertions.assertThat(tab).isNull();
    }

    @Test
    public void shouldReturnTab1x2(){
        //Given
        Puzzle puzzle = new Puzzle();
        int[][] oTableau = {
                {1, 1, 0},
                {0, 1, 0}};

        //When
        int[][] tab = puzzle.sousTableau(oTableau, 1,2, 0, 0);

        //Then
        Assertions.assertThat(tab).isEqualTo(new int[][] {{1, 1}});
    }

    @Test
    public void shouldReturnTab1x2AtCoord1and0(){
        //Given
        Puzzle puzzle = new Puzzle();
        int[][] oTableau = {
                {1, 1, 0},
                {0, 1, 0}};

        //When
        int[][] tab = puzzle.sousTableau(oTableau, 1,2, 0, 1);

        //Then
        Assertions.assertThat(tab).isEqualTo(new int[][] {{0, 1}});
    }

    @Test
    public void shouldReturnTab1x2AtCoord1and1(){
        //Given
        Puzzle puzzle = new Puzzle();
        int[][] oTableau = {
                {1, 1, 0},
                {0, 1, 0}};

        //When
        int[][] tab = puzzle.sousTableau(oTableau, 1,2, 1, 1);

        //Then
        Assertions.assertThat(tab).isEqualTo(new int[][] {{1, 0}});
    }

    @Test
    public void shouldReturnTab1x2AtCoord2and1(){
        //Doit retourner null car cela depasse le tableau
        //Given
        Puzzle puzzle = new Puzzle();
        int[][] oTableau = {
                {1, 1, 0},
                {0, 1, 0}};

        //When
        int[][] tab = puzzle.sousTableau(oTableau, 1,2, 2, 1);

        //Then
        Assertions.assertThat(tab).isNull();
    }

    @Test
    public void shouldReturnTrueWhenPuzzleHaveOneSoluceForPiece1X2(){
        //Given
        Puzzle puzzle = new Puzzle();
        int[][] puzzleBoard =
                         {{1,1,1,1,1,1,1,1,1,1}
                        , {1,1,1,1,1,1,1,1,1,1}
                        , {1,1,1,1,1,1,1,1,1,1}
                        , {1,1,1,1,1,1,1,1,1,1}
                        , {1,1,1,1,1,0,0,1,1,1}
                        , {1,1,1,1,1,1,1,1,1,1}
                        , {1,1,1,1,1,1,1,1,1,1}
                        , {1,1,1,1,1,1,1,1,1,1}
                        , {1,1,1,1,1,1,1,1,1,1}
                        , {1,1,1,1,1,1,1,1,1,1}};
        int[][] piece =
                {{1, 1}};

        //When
        boolean piecePosable = puzzle.piecePosable(puzzleBoard, piece);

        //Then
        Assertions.assertThat(piecePosable).isTrue();
    }

    @Test
    public void shouldReturnTrueWhenPuzzleHaveOneSoluceForPiece4X4(){
        //Given
        Puzzle puzzle = new Puzzle();
        int[][] puzzleBoard =
                         {{1,1,1,1,1,1,1,1,1,1}
                        , {1,1,1,1,1,1,1,1,1,1}
                        , {1,1,1,1,1,1,1,1,1,1}
                        , {1,1,1,1,1,1,1,1,1,1}
                        , {1,1,1,1,0,0,0,0,1,1}
                        , {1,1,1,1,0,0,0,0,1,1}
                        , {1,1,1,1,0,0,0,0,1,1}
                        , {1,1,1,1,0,0,0,0,1,1}
                        , {1,1,1,1,1,1,1,1,1,1}
                        , {1,1,1,1,1,1,1,1,1,1}};
        int[][] piece =
                {{1,1,1,1}
                ,{1,1,1,1}
                ,{1,1,1,1}
                ,{1,1,1,1}};

        //When
        boolean piecePosable = puzzle.piecePosable(puzzleBoard, piece);

        //Then
        Assertions.assertThat(piecePosable).isTrue();
    }

    @Test
    public void shouldReturnTrueWhenPuzzleHaveManySoluceForPiece4X4(){
        //Given
        Puzzle puzzle = new Puzzle();
        int[][] puzzleBoard =
                         {{1,1,1,1,1,1,1,1,1,1}
                        , {1,1,0,0,0,0,1,1,1,1}
                        , {1,1,0,0,0,0,1,1,1,1}
                        , {1,1,0,0,0,0,1,1,1,1}
                        , {1,1,0,0,0,0,0,0,1,1}
                        , {1,1,1,1,0,0,0,0,1,1}
                        , {1,1,1,1,0,0,0,0,1,1}
                        , {1,1,1,1,0,0,0,0,1,1}
                        , {1,1,1,1,1,1,1,1,1,1}
                        , {1,1,1,1,1,1,1,1,1,1}};
        int[][] piece =
                        {{1,1,1,1}
                        ,{1,1,1,1}
                        ,{1,1,1,1}
                        ,{1,1,1,1}};

        //When
        boolean piecePosable = puzzle.piecePosable(puzzleBoard, piece);

        //Then
        Assertions.assertThat(piecePosable).isTrue();
    }

    @Test
    public void shouldReturnTrueWhenPuzzleHaveMany2SoluceForPiece4X4(){
        //Given
        Puzzle puzzle = new Puzzle();
        int[][] puzzleBoard =
                         {{1,1,1,1,1,1,1,1,1,1}
                        , {1,1,0,0,0,0,1,1,1,1}
                        , {1,1,0,1,1,0,1,1,1,1}
                        , {1,1,0,1,1,0,1,1,1,1}
                        , {1,1,0,0,0,0,1,1,1,1}
                        , {1,1,1,1,1,1,1,1,1,1}
                        , {1,1,1,1,1,1,1,1,1,1}
                        , {1,1,1,1,1,1,1,1,1,1}
                        , {1,1,1,1,1,1,1,1,1,1}
                        , {1,1,1,1,1,1,1,1,1,1}};
        int[][] piece =
                        {{1,1,1,1}
                        ,{1,0,0,1}
                        ,{1,0,0,1}
                        ,{1,1,1,1}};

        //When
        boolean piecePosable = puzzle.piecePosable(puzzleBoard, piece);

        //Then
        Assertions.assertThat(piecePosable).isTrue();
    }

}