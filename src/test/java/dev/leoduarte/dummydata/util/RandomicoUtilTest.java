package dev.leoduarte.dummydata.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;

class RandomicoUtilTest {

    @RepeatedTest(100)
    void getRandomico() {
        Integer valorMaximo = 10;
        Integer randomico = RandomicoUtil.getRandomico(valorMaximo);

        Assertions.assertTrue(randomico < valorMaximo);
    }

    @RepeatedTest(100)
    void getRandomicoEntre() {
        Integer valorMinimo = 2;
        Integer valorMaximo = 10;
        Integer randomico = RandomicoUtil.getRandomicoEntre(valorMinimo, valorMaximo);

        Assertions.assertTrue(randomico >= valorMinimo);
        Assertions.assertTrue(randomico <= valorMaximo);
    }
}