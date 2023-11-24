package dev.leoduarte.dummydata.geograficos;

import java.util.Arrays;
import java.util.List;

import static dev.leoduarte.dummydata.util.RandomicoUtil.getRandomico;

public class EstadosBrasileiros {

    private static final List<String> siglas = Arrays.asList("AC", "AL", "AP", "AM", "BA", "CE", "ES", "GO", "MA", "MT",
            "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO", "DF");
    private static final List<String> estados = Arrays.asList("Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará",
            "Espírito Santo", "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Pará",
            "Paraíba", "Paraná", "Pernambuco", "Piauí", "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul",
            "Rondônia", "Roraima", "Santa Catarina", "São Paulo", "Sergipe", "Tocantins",
            "Distrito Federal");


    public static String getSiglaRandomica() {
        return siglas.get(getRandomico(estados.size()));
    }

    public static String getSigla(String nomeCompleto) {
        int index = estados.indexOf(nomeCompleto);
        return siglas.get(index);
    }

    public static String getNomeCompletoRandomico() {
        return estados.get(getRandomico(estados.size()));
    }

    public static String getNomeCompleto(String sigla) {
        int index = siglas.indexOf(sigla);
        return estados.get(index);
    }

    public static List<String> getListaDeEstados() throws ArrayIndexOutOfBoundsException {
        return estados;
    }

    public static List<String> getListaDeSiglas() throws ArrayIndexOutOfBoundsException {
        return siglas;
    }
}
