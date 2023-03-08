package poo;

public class Calculadora {

    private double resultado;
    private String operador = "";

    public void entrada(final double valor) {

        if ("".equals(operador)) {
            this.resultado = valor;
        } else {
            this.calcular(valor);
        }

    }

    public void setOperador(final String operador) {
        this.operador = operador;
    }

    public double getResultado() {
        return this.resultado;
    }

    private void calcular(final double numero) {

        switch (this.operador) {
            case "+":
                this.resultado += numero;
                break;
            case "-":
                this.resultado -= numero;
                break;
            case "*":
                this.resultado *= numero;
                break;
            case "/":
                this.resultado /= numero;
                break;
            default:
                return;
        }
        this.operador = "";
    }
}
