public class Lampada {
    private int potencia;
    private String tipo;
    private boolean acesa;

    public Lampada(int potencia, String tipo) {
        this.potencia = potencia;
        this.tipo = tipo;
        this.acesa = false;
    }

    // getters e setters

    public void acender() {
        this.acesa = true;
    }

    public void desligar() {
        this.acesa = false;
    }

    public boolean isAcesa() {
        return this.acesa;
    }
}
