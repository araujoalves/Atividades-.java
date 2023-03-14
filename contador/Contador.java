public class Contador {
    private int valor;

    public Contador() {
        this.valor = 0;
    }

    public Contador(int valorInicial) {
        this.valor = valorInicial;
    }

    public void incrementar() {
        this.valor++;
    }

    public void resetar() {
        this.valor = 0;
    }

    @Override
    public String toString() {
        return "Contador: " + this.valor;
    }
}