package exemplos;

public class Endereco {
    private String cep;
    private String numero;

    public Endereco (String cep, String numero) {
        this.cep = cep;
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public String getNumero() {
        return numero;
    }
}
