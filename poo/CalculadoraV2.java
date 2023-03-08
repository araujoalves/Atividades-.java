package poo;

public class CalculadoraV2 {

    private double resultado;
    private TipoOperador operador = TipoOperador.NENHUM;

    public void entrada(final double valor) {
        if (this.operador == TipoOperador.NENHUM) {
            this.resultado = valor;
        } else {
            this.calcular(valor);
        }
    }

    public void setOperador(final TipoOperador operador) {
        this.operador = operador;
    }

    public double getResultado() {
        return this.resultado;
    }

    private void calcular(final double numero) {
        this.resultado = TipoOperador.calcular(this.operador, this.resultado, numero);
        this.operador = TipoOperador.NENHUM;
    }

}
