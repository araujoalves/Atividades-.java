package Poo;

public class ParOuImpar {
    private final int valor;

    public ParOuImpar(final int valor) {
        this.valor = valor;
    }

    public boolean ehPar() {
        return (0 == valor % 2);
    }

}
