package fr.pnoel;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class BatailleNavaleTest {
    @Test
    public void shouldReturnTrueWhenBoardContainsBoat1x1AtIndice0x0(){
        //Given
        BatailleNavale batailleNavale = new BatailleNavale();
        int[][] board =    {{1,0,0,0,0,0,0,0,0,0},
                            {0,0,0,0,0,0,0,0,0,0},
                            {0,0,0,0,0,0,0,0,0,0},
                            {0,0,0,0,0,0,0,0,0,0},
                            {0,0,0,0,0,0,0,0,0,0},
                            {0,0,0,0,0,0,0,0,0,0},
                            {0,0,0,0,0,0,0,0,0,0},
                            {0,0,0,0,0,0,0,0,0,0},
                            {0,0,0,0,0,0,0,0,0,0},
                            {0,0,0,0,0,0,0,0,0,0}};

        //When
        int ifsuccess = batailleNavale.ifSuccess(board);

        //Then
        Assertions.assertThat(ifsuccess).isEqualTo(1);


    }

}