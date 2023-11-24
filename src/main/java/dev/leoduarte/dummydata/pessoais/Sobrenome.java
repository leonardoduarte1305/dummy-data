package dev.leoduarte.dummydata.pessoais;

import java.util.Arrays;
import java.util.List;

import static dev.leoduarte.dummydata.util.RandomicoUtil.getRandomico;

public class Sobrenome {

    private static final List<String> sobrenomes = Arrays.asList(
            "Silva", "Santos", "Oliveira", "Pereira", "Almeida",
            "Costa", "Martins", "Araújo", "Ferreira", "Lima",
            "Souza", "Carvalho", "Rodrigues", "Gomes", "Nascimento",
            "Rocha", "Cavalcante", "Melo", "Barros", "Cardoso",
            "Correia", "Cruz", "Batista", "Dias", "Freitas",
            "Mendes", "Pinto", "Reis", "Sá", "Teixeira",
            "Vieira", "Campos", "Fernandes", "Moreira", "Nunes",
            "Queiroz", "Santana", "Xavier", "Zanatta", "Fogaça",
            "Pacheco", "Machado", "Fraga", "Guimarães", "Morais",
            "Ribeiro", "Alves", "Lopes", "Lisboa", "Borges",
            "Fonseca", "Marques", "Amaral", "Castro", "Brito",
            "Andrade", "Gonçalves", "Cunha", "Dantas", "Farias",
            "Leal", "Moura", "Teles", "Vargas", "Arruda",
            "Bezerra", "Cavalcanti", "Cerqueira", "Dutra", "Espinosa",
            "Galvão", "Monteiro", "Peixoto", "Rios", "Salazar",
            "Uchoa", "Vasconcelos", "Aragão", "Brasil", "Coutinho",
            "Figueiredo", "Junqueira", "Miranda", "Oliveira", "Quintana",
            "Santiago", "Torres", "Vargas", "Ximenes", "Zambrano");

    public static String getSobrenomeAleatorio() {
        return sobrenomes.get(getRandomico(sobrenomes.size()));
    }

    public static List<String> getListaDeSobrenomes(Integer tamanho) {
        return sobrenomes.stream().limit(tamanho).toList();
    }

    public static List<String> getListaDeSobrenomesIniciadosCom(String inicioDoSobrenome) {
        return sobrenomes.stream().filter(sobrenome -> sobrenome.startsWith(inicioDoSobrenome)).toList();
    }
}
