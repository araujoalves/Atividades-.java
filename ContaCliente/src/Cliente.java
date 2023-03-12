
public class Cliente {

    private String cpfcnpj;
    private String nome;

    public Cliente(String cpfcnpj, String nome) {
        this.cpfcnpj = cpfcnpj;
        this.nome = nome;
    }

    public String getCpfcnpj() {
        return cpfcnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}



