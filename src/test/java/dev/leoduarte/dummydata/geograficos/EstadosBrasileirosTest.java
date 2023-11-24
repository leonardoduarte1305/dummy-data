package dev.leoduarte.dummydata.geograficos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.List;

class EstadosBrasileirosTest {

    @RepeatedTest(100)
    void getSiglaRandomica() {
        String siglaRandomica1 = EstadosBrasileiros.getSiglaRandomica();
        String siglaRandomica2 = EstadosBrasileiros.getSiglaRandomica();
        String siglaRandomica3 = EstadosBrasileiros.getSiglaRandomica();
        String siglaRandomica4 = EstadosBrasileiros.getSiglaRandomica();
        String siglaRandomica5 = EstadosBrasileiros.getSiglaRandomica();
        String siglaRandomica6 = EstadosBrasileiros.getSiglaRandomica();
        String siglaRandomica7 = EstadosBrasileiros.getSiglaRandomica();
        String siglaRandomica8 = EstadosBrasileiros.getSiglaRandomica();

        System.out.println("siglaRandomica1 = " + siglaRandomica1);
        System.out.println("siglaRandomica2 = " + siglaRandomica2);
        System.out.println("siglaRandomica3 = " + siglaRandomica3);
        System.out.println("siglaRandomica4 = " + siglaRandomica4);
        System.out.println("siglaRandomica5 = " + siglaRandomica5);
        System.out.println("siglaRandomica6 = " + siglaRandomica6);
        System.out.println("siglaRandomica7 = " + siglaRandomica7);
        System.out.println("siglaRandomica8 = " + siglaRandomica8);
    }

    @Test
    void getSigla() {
        String rioDeJaneiro = EstadosBrasileiros.getSigla("Rio de Janeiro");
        System.out.println("rioDeJaneiro = " + rioDeJaneiro);

        String santaCatarina = EstadosBrasileiros.getSigla("Santa Catarina");
        System.out.println("santaCatarina = " + santaCatarina);

        String parana = EstadosBrasileiros.getSigla("Paraná");
        System.out.println("paraná = " + parana);
    }

    @RepeatedTest(100)
    void getNomeCompletoRandomico() {
        String nomeCompletoRandomico1 = EstadosBrasileiros.getNomeCompletoRandomico();
        String nomeCompletoRandomico2 = EstadosBrasileiros.getNomeCompletoRandomico();
        String nomeCompletoRandomico3 = EstadosBrasileiros.getNomeCompletoRandomico();
        String nomeCompletoRandomico4 = EstadosBrasileiros.getNomeCompletoRandomico();
        String nomeCompletoRandomico5 = EstadosBrasileiros.getNomeCompletoRandomico();
        String nomeCompletoRandomico6 = EstadosBrasileiros.getNomeCompletoRandomico();
        String nomeCompletoRandomico7 = EstadosBrasileiros.getNomeCompletoRandomico();
        String nomeCompletoRandomico8 = EstadosBrasileiros.getNomeCompletoRandomico();

        System.out.println("nomeCompletoRandomico1 = " + nomeCompletoRandomico1);
        System.out.println("nomeCompletoRandomico2 = " + nomeCompletoRandomico2);
        System.out.println("nomeCompletoRandomico3 = " + nomeCompletoRandomico3);
        System.out.println("nomeCompletoRandomico4 = " + nomeCompletoRandomico4);
        System.out.println("nomeCompletoRandomico5 = " + nomeCompletoRandomico5);
        System.out.println("nomeCompletoRandomico6 = " + nomeCompletoRandomico6);
        System.out.println("nomeCompletoRandomico7 = " + nomeCompletoRandomico7);
        System.out.println("nomeCompletoRandomico8 = " + nomeCompletoRandomico8);
    }

    @Test
    void getNomeCompleto() {
        String rs = EstadosBrasileiros.getNomeCompleto("RS");
        System.out.println("rs = " + rs);

        String am = EstadosBrasileiros.getNomeCompleto("AM");
        System.out.println("am = " + am);

        String es = EstadosBrasileiros.getNomeCompleto("ES");
        System.out.println("es = " + es);
    }

    @Test
    void getListaDeEstados() {
        List<String> listaDeEstados = EstadosBrasileiros.getListaDeEstados();
        listaDeEstados.forEach(System.out::println);

        Integer arraySize = 27;
        Assertions.assertEquals(arraySize, listaDeEstados.size());
    }

    @Test
    void getListDeSiglas() {
        List<String> listDeSiglas = EstadosBrasileiros.getListaDeSiglas();
        listDeSiglas.forEach(System.out::println);

        Integer arraySize = 27;
        Assertions.assertEquals(arraySize, listDeSiglas.size());
    }

    @Test
    void procurarPorSiglaInexistenteLancaException() {
        Assertions.assertThrowsExactly(ArrayIndexOutOfBoundsException.class,
                () -> EstadosBrasileiros.getSigla("inexistente"));
    }

    @Test
    void procurarPorNomeInexistenteLancaException() {
        Assertions.assertThrowsExactly(ArrayIndexOutOfBoundsException.class,
                () -> EstadosBrasileiros.getNomeCompleto("inexistente"));
    }
}