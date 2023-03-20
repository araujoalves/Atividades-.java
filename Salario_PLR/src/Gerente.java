public class Gerente extends Funcionario {
    public Gerente(double salario) {
        super(salario);
    }

    @Override
    public double calcularPLR() {
        return 4 * super.calcularPLR();
    }
}
