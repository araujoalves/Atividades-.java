public class Cliente {

    private String cpf;
    private String nome;

    public cliente(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }
}

public class ExemploCliente {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("123.456.789-00", "João da Silva");
        Cliente cliente2 = new Cliente("987.654.321-00", "Maria da Silva");

        System.out.println("Cliente 1: " + cliente1.getNome() + " - CPF: " + cliente1.getCpf());
        System.out.println("Cliente 2: " + cliente2.getNome() + " - CPF: " + cliente2.getCpf());
    }

}
