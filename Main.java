package POO_JE12.COLOCANDO_EM_PRATICA;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Contato contato1 = new Contato("amigo1@exemplo.com", "123456789", "@amigo1");
        Endereco endereco1 = new Endereco("Rua A", 123, "Cidade A", "AA");
        Amigo amigo1 = new Amigo("Amigo Um", "Amigão", LocalDate.of(1990, 1, 1), contato1, endereco1);

        Contato contato2 = new Contato("amigo2@exemplo.com", "987654321", "@amigo2");
        Endereco endereco2 = new Endereco("Rua B", 456, "Cidade B", "BB");
        Amigo amigo2 = new Amigo("Amigo Dois", "Parceiro", LocalDate.of(1991, 2, 2), contato2, endereco2);

        Contato contato3 = new Contato("amigo3@exemplo.com", "555555555", "@amigo3");
        Endereco endereco3 = new Endereco("Rua C", 789, "Cidade C", "CC");
        Amigo amigo3 = new Amigo("Amigo Três", "Companheiro", LocalDate.of(1992, 3, 3), contato3, endereco3);

        amigo1.exibirInformacoesAleatorias();
        amigo2.exibirInformacoesAleatorias();
        amigo3.exibirInformacoesAleatorias();
    }
}
