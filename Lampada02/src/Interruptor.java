public class Interruptor {

    private Lampada lampada;
    private boolean ligado;

    public Interruptor(Lampada lampada) {
        this.lampada = lampada;
    }

    public Interruptor() {

    }

    public void conectar(Lampada l) {
        this.lampada = l;

    }

    public void ligar() {
        if (this.ligado == false) {
            this.ligado = true;
            if (lampada != null) {
                lampada.acender();
            }
        }
    }

    public void desligar() {
        if (this.ligado) {
            this.ligado = false;
            if (lampada != null) {
                lampada.desligar();
            }
        }
    }
}


