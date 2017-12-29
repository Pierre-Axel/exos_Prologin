package fr.pnoel;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class InitialesTest {
    @Test
    public void test_Initiales(){
        assertThat(new Initiales().printInitiales("Je suis le plus beau")).isEqualTo("JSLPB");
    }
}
