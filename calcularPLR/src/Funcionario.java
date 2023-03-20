public class Funcionario {
    protected String nome;
    protected String cpf;
    protected double salario;

    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public double calcularPLR() {
        return salario * 0.15;
    }

    public double calcularFerias() {
        return salario + (salario * 0.33);
    }
}

