public class Estagiario extends Funcionario {
    public Estagiario(double salario) {
        super(salario);
    }

    @Override
    public double calcularPLR() {
        return 2 * super.calcularPLR();
    }
}
