package ImparEpar;

public class ParOuImpar {
    private final int valor;

    public ParOuImpar(int valor) {
        this.valor = valor;
    }

    public boolean ehPar() {
        return (0 == this.valor % 2);
    }

}
