package fr.pnoel;

import org.junit.Test;

import java.util.List;
import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;

public class NombreImpairTest {

    @Test
    public void shouldPrintNothingFor10To10(){
        assertThat(new NombreImpair().printNombreImpair(10, 10)).isEqualTo("");
    }

    @Test
    public void shouldPrint11For11To11(){
        assertThat(new NombreImpair().printNombreImpair(11, 11)).isEqualTo("11");
}

    @Test
    public void shouldPrint9For8To10(){
        assertThat(new NombreImpair().printNombreImpair(8, 10)).isEqualTo("9");
    }

    @Test
    public void shouldPrint9For9To10(){
        assertThat(new NombreImpair().printNombreImpair(9, 10)).isEqualTo("9");
    }

    @Test
    public void shouldPrint13For12To14(){
        assertThat(new NombreImpair().printNombreImpair(12, 14)).isEqualTo("13");
    }

    @Test
    public void shouldPrint13For13To14(){
        assertThat(new NombreImpair().printNombreImpair(13, 14)).isEqualTo("13");
    }

    @Test
    public void shouldPrint15For14To16(){
        assertThat(new NombreImpair().printNombreImpair(14, 16)).isEqualTo("15");
    }

    @Test
    public void shouldPrint13and15For12To16(){
        assertThat(new NombreImpair().printNombreImpair(12, 16)).isEqualTo("13 15");
    }

    @Test
    public void shouldPrint11and13and15andFor11To17(){
        assertThat(new NombreImpair().printNombreImpair(11, 17)).isEqualTo("11 13 15 17");
    }

    @Test
    public void shouldPrintForRandomNumbers() {
        for (int i = 0; i < 100; i++) {
            randomTest();
        }
    }

    public void randomTest(){
        NombreImpair nombreImpair = new NombreImpair();
        int petitNombre = new Random().nextInt(200);
        int grandNombre = petitNombre + new Random().nextInt(200-petitNombre);
        System.out.println(petitNombre);
        List<Integer> integers = nombreImpair.doPrintNombreImpair(petitNombre, grandNombre);

        int rabbiot = petitNombre % 2 != 0 || grandNombre %2 != 0 ? 1 : 0;
        assertThat(integers.size()).isEqualTo((grandNombre-petitNombre)/2+rabbiot);
        for (Integer integer : integers) {
            assertThat(integer % 2).isEqualTo(1);
        }
    }

}
