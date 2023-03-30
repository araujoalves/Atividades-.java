package projeto_Car_Rental;

public class Carro {
    private String tipo;
    private String cor;
    private int ano;

    public Carro(String tipo, String cor, int ano) {
        this.tipo = tipo;
        this.cor = cor;
        this.ano = ano;
    }

    public String getTipo() {
        return tipo;
    }

    public String getCor() {
        return cor;
    }

    public int getAno() {
        return ano;
    }
}
