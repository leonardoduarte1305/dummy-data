package dev.leoduarte.dummydata.financeiros;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class AcoesTest {

    @Test
    void getSiglaAleatoria() {
        String siglaAleatoria1 = Acoes.getSiglaRandomica();
        String siglaAleatoria2 = Acoes.getSiglaRandomica();
        String siglaAleatoria3 = Acoes.getSiglaRandomica();
        String siglaAleatoria4 = Acoes.getSiglaRandomica();
        String siglaAleatoria5 = Acoes.getSiglaRandomica();
        String siglaAleatoria6 = Acoes.getSiglaRandomica();
        String siglaAleatoria7 = Acoes.getSiglaRandomica();
        String siglaAleatoria8 = Acoes.getSiglaRandomica();

        System.out.println("siglaAleatoria1 = " + siglaAleatoria1);
        System.out.println("siglaAleatoria2 = " + siglaAleatoria2);
        System.out.println("siglaAleatoria3 = " + siglaAleatoria3);
        System.out.println("siglaAleatoria4 = " + siglaAleatoria4);
        System.out.println("siglaAleatoria5 = " + siglaAleatoria5);
        System.out.println("siglaAleatoria6 = " + siglaAleatoria6);
        System.out.println("siglaAleatoria7 = " + siglaAleatoria7);
        System.out.println("siglaAleatoria8 = " + siglaAleatoria8);
    }

    @Test
    void getListaDeEmpresas() {
        List<String> listaDeEmpresas = Acoes.getListaDeEmpresas();
        Assertions.assertEquals(50, listaDeEmpresas.size());
    }

    @Test
    void getListaDeSiglas() {
        List<String> listaDeSiglas = Acoes.getListaDeSiglas();
        System.out.println("listaDeSiglas = " + listaDeSiglas);
        Assertions.assertEquals(50, listaDeSiglas.size());
    }

    @Test
    void getNomeCompleto() {
        String radl3 = Acoes.getNomeCompleto("RADL3");
        String radl3Expected = "Randon S.A. Implementos e Participacoes";
        Assertions.assertEquals(radl3Expected, radl3);

        String itub4 = Acoes.getNomeCompleto("ITUB4");
        String itub4Expected = "Itau Unibanco Holding S.A.";
        Assertions.assertEquals(itub4Expected, itub4);
    }
}