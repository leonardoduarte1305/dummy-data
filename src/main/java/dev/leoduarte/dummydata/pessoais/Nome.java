package dev.leoduarte.dummydata.pessoais;

import java.util.Arrays;
import java.util.List;

import static dev.leoduarte.dummydata.util.RandomicoUtil.getRandomico;

public class Nome {

    private static final List<String> nomesProprios = Arrays.asList(
            "Ana", "João", "Maria", "Pedro", "Isabela",
            "Lucas", "Gabriela", "Matheus", "Juliana", "Rafael",
            "Fernanda", "Gustavo", "Carolina", "Rodrigo", "Amanda",
            "Tiago", "Larissa", "Bruno", "Camila", "Vinícius",
            "Mariana", "Felipe", "Thaís", "Diego", "Vanessa",
            "Alexandre", "Luana", "Eduardo", "Tatiane", "Daniel",
            "Beatriz", "Renato", "Patrícia", "Ricardo", "Laura",
            "Caio", "Flávia", "Guilherme", "Fernanda", "Hugo",
            "Débora", "Leonardo", "Mônica", "André", "Natália",
            "Marcelo", "Jéssica", "Miguel", "Bianca", "César",
            "Luiza", "Thiago", "Aline", "Luciano", "Cristiane",
            "Felícia", "Ronaldo", "Luísa", "Alex", "Clara",
            "Carlos", "Júlia", "Paulo", "Vivian", "Renan",
            "Ana Carolina", "Roberto", "Mariana", "Arthur", "Raquel",
            "Vinícius", "Nathalia", "José", "Talita", "Marco",
            "Lorena", "Sérgio", "Carla", "Raul", "Kelly",
            "Erick", "Thamires", "Antônio", "Giovana", "Wagner",
            "Beatriz", "Fábio", "Isadora", "Gustavo", "Daniela",
            "Rogério", "Isabel", "Marcos", "Renata", "Rafael");

    public String getNomeAleatorio() {
        return nomesProprios.get(getRandomico(nomesProprios.size()));
    }

    public List<String> getListaDeNomes(Integer tamanho) {
        return nomesProprios.stream().limit(tamanho).toList();
    }

    public List<String> getListaDeNomesIniciadosCom(String inicioDoNome) {
        return nomesProprios.stream().filter(nome -> nome.startsWith(inicioDoNome)).toList();
    }
}
