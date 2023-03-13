public class Lampada {
    private boolean estado;
    private int potencia;

    public Lampada(int potencia) {
        this.potencia = potencia;
        this.estado = false;
    }

    public void ligar() {
        this.estado = true;
        System.out.println("A lâmpada foi ligada.");
    }

    public void desligar() {
        this.estado = false;
        System.out.println("A lâmpada foi desligada.");
    }

    public boolean getEstado() {
        return this.estado;
    }

    public int getPotencia() {
        return this.potencia;
    }

    public void setPotencia(int novaPotencia) {
        this.potencia = novaPotencia;
        System.out.println("A potência da lâmpada foi ajustada para " + novaPotencia + " watts.");
    }
}
