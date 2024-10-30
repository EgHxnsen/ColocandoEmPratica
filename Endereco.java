package POO_JE12.COLOCANDO_EM_PRATICA;
class Endereco {
    private String logradouro;
    private int numero;
    private String cidade;
    private String siglaEstado;

    public Endereco(String logradouro, int numero, String cidade, String siglaEstado) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.cidade = cidade;
        this.siglaEstado = siglaEstado;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public String getCidade() {
        return cidade;
    }

    public String getSiglaEstado() {
        return siglaEstado;
    }
}
