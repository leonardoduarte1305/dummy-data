package dev.leoduarte.dummydata.pessoais;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class NomeTest {

    private Nome nome;

    @BeforeEach
    void setup() {
        nome = new Nome();
    }

    @Test
    void getNomeAleatorio() {
        String nomeAleatorio1 = nome.getNomeAleatorio();
        String nomeAleatorio2 = nome.getNomeAleatorio();
        String nomeAleatorio3 = nome.getNomeAleatorio();
        String nomeAleatorio4 = nome.getNomeAleatorio();
        String nomeAleatorio5 = nome.getNomeAleatorio();
        String nomeAleatorio6 = nome.getNomeAleatorio();
        String nomeAleatorio7 = nome.getNomeAleatorio();
        String nomeAleatorio8 = nome.getNomeAleatorio();

        System.out.println("nomeAleatorio1 = " + nomeAleatorio1);
        System.out.println("nomeAleatorio2 = " + nomeAleatorio2);
        System.out.println("nomeAleatorio3 = " + nomeAleatorio3);
        System.out.println("nomeAleatorio4 = " + nomeAleatorio4);
        System.out.println("nomeAleatorio5 = " + nomeAleatorio5);
        System.out.println("nomeAleatorio6 = " + nomeAleatorio6);
        System.out.println("nomeAleatorio7 = " + nomeAleatorio7);
        System.out.println("nomeAleatorio8 = " + nomeAleatorio8);
    }

    @Test
    void getListaDeNomes() {
        Integer tamanho = 5;
        List<String> listaDeNomes = nome.getListaDeNomes(tamanho);
        listaDeNomes.forEach(System.out::println);

        Assertions.assertEquals(tamanho, listaDeNomes.size());
    }

    @Test
    void getListaDeNomesIniciadosComL() {
        List<String> iniciadosComL = nome.getListaDeNomesIniciadosCom("L");
        iniciadosComL.forEach(System.out::println);
    }

    @Test
    void getListaDeNomesIniciadosComN() {
        List<String> iniciadosComN = nome.getListaDeNomesIniciadosCom("N");
        iniciadosComN.forEach(System.out::println);
    }

}