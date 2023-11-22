package dev.leoduarte.dummydata.util;

import java.util.Random;

public class RandomicoUtil {

    public static Integer getRandomico(Integer maximo) {
        return getRandomicoEntre(0, maximo);
    }

    public static Integer getRandomicoEntre(Integer minimo, Integer maximo) {
        return new Random().nextInt(minimo, maximo);
    }
}
