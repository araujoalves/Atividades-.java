
public class Contador {
    private int valor;

    public Contador() {
        this.valor = 0;
    }

    public Contador(int valorInicial) {
        this.valor = valorInicial;
    }

    public int getValor() {
        return this.valor;
    }

    public void setValor(int novoValor) {
        this.valor = novoValor;
    }

    public void incrementar() {
        this.valor++;
    }

    public void resetar() {
        this.valor = 0;
    }

    public String toString() {
        return "Valor atual do contador: " + this.getValor();
    }

    public static void main(String[] args) {
        Contador contador = new Contador();

        while (contador.getValor() < 10) {
            System.out.println(contador.toString());
            contador.incrementar();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(contador.toString());
    }
}

