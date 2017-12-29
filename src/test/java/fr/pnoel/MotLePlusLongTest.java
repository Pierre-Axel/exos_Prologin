package fr.pnoel;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class MotLePlusLongTest {
    @Test
    public void test_MotLePlusLong(){
        assertThat(new MotLePlusLong().printMotLePlusLong("Voici un pharse avec dedant un mot qui est plus long que les autres comme anticonstitutionnellement")).isEqualTo("anticonstitutionnellement");
    }

}
