package fr.pnoel;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EscalierTest {

    @Test
    public void test_Escalier() {
        assertThat(new Escalier().printEscalier(3)).isEqualTo("*\n**\n***\n");
    }

}
