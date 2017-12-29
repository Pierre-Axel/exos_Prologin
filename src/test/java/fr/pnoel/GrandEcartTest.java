package fr.pnoel;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GrandEcartTest {
    @Test
    public void test_GrandEcart() {
        int[] tableauEntier = {858,454,788,54,6};
        assertThat(new GrandEcart().printGrandEcart(tableauEntier)).isEqualTo(852);
    }
}
