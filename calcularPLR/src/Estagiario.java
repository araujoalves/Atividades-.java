public class Estagiario extends Funcionario {
    private int cargaHoraria;

    public Estagiario(String nome, String cpf, double salario, int cargaHoraria) {
        super(nome, cpf, salario);
        this.cargaHoraria = cargaHoraria;
    }
}
