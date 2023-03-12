
public class Ventilador {
    public static final int BAIXA = 1;
    public static final int MEDIA = 2;
    public static final int RAPIDA = 3;

    public static final String BRANCO = "branco";
    public static final String PRETO = "preto";

    private int velocidade;
    private boolean ligado;
    private String cor;

    public Ventilador() {
        this.velocidade = BAIXA;
        this.ligado = false;
        this.cor = BRANCO;
    }

    public Ventilador(String cor) {
        this.velocidade = BAIXA;
        this.ligado = false;
        this.cor = cor;
    }

    public void ligar() {
        this.ligado = true;
    }

    public void desligar() {
        this.ligado = false;
    }

    public void mudarVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void mudarVelocidadeBaixa() {
        this.velocidade = BAIXA;
    }

    public void mudarVelocidadeMedia() {
        this.velocidade = MEDIA;
    }

    public void mudarVelocidadeRapida() {
        this.velocidade = RAPIDA;
    }

    public String toString() {
        String status = this.ligado ? "ligado" : "desligado";
        return "Ventilador " + this.cor + ", " + status + ", velocidade " + this.velocidade;
    }
}








