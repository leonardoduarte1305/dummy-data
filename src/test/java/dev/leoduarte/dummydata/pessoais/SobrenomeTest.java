package dev.leoduarte.dummydata.pessoais;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class SobrenomeTest {

    @Test
    void getSobrenomeAleatorio() {
        String sobrenomeAleatorio1 = Sobrenome.getSobrenomeAleatorio();
        String sobrenomeAleatorio2 = Sobrenome.getSobrenomeAleatorio();
        String sobrenomeAleatorio3 = Sobrenome.getSobrenomeAleatorio();
        String sobrenomeAleatorio4 = Sobrenome.getSobrenomeAleatorio();
        String sobrenomeAleatorio5 = Sobrenome.getSobrenomeAleatorio();
        String sobrenomeAleatorio6 = Sobrenome.getSobrenomeAleatorio();
        String sobrenomeAleatorio7 = Sobrenome.getSobrenomeAleatorio();
        String sobrenomeAleatorio8 = Sobrenome.getSobrenomeAleatorio();

        System.out.println("sobrenomeAleatorio1 = " + sobrenomeAleatorio1);
        System.out.println("sobrenomeAleatorio2 = " + sobrenomeAleatorio2);
        System.out.println("sobrenomeAleatorio3 = " + sobrenomeAleatorio3);
        System.out.println("sobrenomeAleatorio4 = " + sobrenomeAleatorio4);
        System.out.println("sobrenomeAleatorio5 = " + sobrenomeAleatorio5);
        System.out.println("sobrenomeAleatorio6 = " + sobrenomeAleatorio6);
        System.out.println("sobrenomeAleatorio7 = " + sobrenomeAleatorio7);
        System.out.println("sobrenomeAleatorio8 = " + sobrenomeAleatorio8);
    }

    @Test
    void getListaDeSobrenomes() {
        Integer tamanho = 5;
        List<String> listaDeSobrenomes = Sobrenome.getListaDeSobrenomes(tamanho);
        listaDeSobrenomes.forEach(System.out::println);

        Assertions.assertEquals(tamanho, listaDeSobrenomes.size());
    }

    @Test
    void getListaDeSobrenomesIniciadosComL() {
        List<String> iniciadosComL = Sobrenome.getListaDeSobrenomesIniciadosCom("L");
        iniciadosComL.forEach(System.out::println);
    }

    @Test
    void getListaDeSobrenomesIniciadosComN() {
        List<String> iniciadosComN = Sobrenome.getListaDeSobrenomesIniciadosCom("N");
        iniciadosComN.forEach(System.out::println);
    }
}