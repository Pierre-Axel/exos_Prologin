package fr.pnoel;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class Puissance4Test {

    @Test
    public void shouldReturn0ForEmptyBoard() {
        // Given
        Puissance4 puissance4 = new Puissance4();
        int[][] board =
                {{0,0,0,0,0,0,0}
                , {0,0,0,0,0,0,0}
                , {0,0,0,0,0,0,0}
                , {0,0,0,0,0,0,0}
                , {0,0,0,0,0,0,0}
                , {0,0,0,0,0,0,0}};

        // When
        int whowon = puissance4.whowon(board);

        // Then
        Assertions.assertThat(whowon).isEqualTo(0);
    }

    @Test
    public void shouldReturn1ForStraitBeginningHorizontalLineOnFirstRow() {
        // Given
        Puissance4 puissance4 = new Puissance4();
        int[][] board =
                {{0,0,0,0,0,0,0}
                , {0,0,0,0,0,0,0}
                , {0,0,0,0,0,0,0}
                , {0,0,0,0,0,0,0}
                , {0,0,0,0,0,0,0}
                , {1,1,1,1,0,0,0}};

        // When
        int whowon = puissance4.whowon(board);

        // Then
        Assertions.assertThat(whowon).isEqualTo(1);
    }

    @Test
    public void shouldReturn0ForTooSmallStraitHorizontalLineOnFirstRow() {
        // Given
        Puissance4 puissance4 = new Puissance4();
        int[][] board =
                         {{0,0,0,0,0,0,0}
                        , {0,0,0,0,0,0,0}
                        , {0,0,0,0,0,0,0}
                        , {0,0,0,0,0,0,0}
                        , {0,0,0,0,0,0,0}
                        , {1,0,0,0,0,0,0}};

        // When
        int whowon = puissance4.whowon(board);

        // Then
        Assertions.assertThat(whowon).isEqualTo(0);
    }

    @Test
    public void shouldReturn1ForStraitEndingHorizontalLineOnFirstRow() {
        // Given
        Puissance4 puissance4 = new Puissance4();
        int[][] board =
                {{0,0,0,0,0,0,0}
                        , {0,0,0,0,0,0,0}
                        , {0,0,0,0,0,0,0}
                        , {0,0,0,0,0,0,0}
                        , {0,0,0,0,0,0,0}
                        , {0,0,0,1,1,1,1}};

        // When
        int whowon = puissance4.whowon(board);

        // Then
        Assertions.assertThat(whowon).isEqualTo(1);
    }

    @Test
    public void shouldReturn1ForStraitEndingHorizontalLineOnSecondRow() {
        // Given
        Puissance4 puissance4 = new Puissance4();
        int[][] board =
                {{0,0,0,0,0,0,0}
                        , {0,0,0,0,0,0,0}
                        , {0,0,0,0,0,0,0}
                        , {0,0,0,0,0,0,0}
                        , {0,0,0,1,1,1,1}
                        , {2,2,2,1,2,1,1}};

        // When
        int whowon = puissance4.whowon(board);

        // Then
        Assertions.assertThat(whowon).isEqualTo(1);
    }

    @Test
    public void shouldReturn1ForStraitBeginningVerticalLineOnFirstColumn() {
        // Given
        Puissance4 puissance4 = new Puissance4();
        int[][] board =
                         {{0,0,0,0,0,0,0}
                        , {0,0,0,0,0,0,0}
                        , {2,0,0,0,0,0,0}
                        , {2,0,0,0,0,0,0}
                        , {2,0,0,0,0,0,0}
                        , {2,0,0,1,0,0,0}};

        // When
        int whowon = puissance4.whowon(board);

        // Then
        Assertions.assertThat(whowon).isEqualTo(2);
    }


}