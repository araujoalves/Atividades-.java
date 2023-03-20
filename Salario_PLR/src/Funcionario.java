public class Funcionario {
    private double salario;

    public Funcionario(double salario) {
        this.salario = salario;
    }

    public double calcularPLR() {
        return 3 * salario;
    }
}