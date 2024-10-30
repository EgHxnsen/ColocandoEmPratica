package POO_JE12.COLOCANDO_EM_PRATICA;
import java.time.LocalDate;


class Amigo {
    private String nome;
    private String apelido;
    private LocalDate dataNascimento;
    private Contato contato;
    private Endereco endereco;

    public Amigo(String nome, String apelido, LocalDate dataNascimento, Contato contato, Endereco endereco) {
        this.nome = nome;
        this.apelido = apelido;
        this.dataNascimento = dataNascimento;
        this.contato = contato;
        this.endereco = endereco;
    }

    public void exibirInformacoesAleatorias() {
        System.out.println(nome + " tem o email " + contato.getEmail() + " e mora em " + endereco.getCidade() + ", " + endereco.getSiglaEstado());
    }
}