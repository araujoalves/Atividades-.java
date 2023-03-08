package poo;

public class Calculadora {

    private double resultado;
    private String operador = "";

    public void entrada(double valor) {

        if ("".equals(this.operador)) {
            resultado = valor;
        } else {
            calcular(valor);
        }

    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public double getResultado() {
        return resultado;
    }

    private void calcular(double numero) {

        switch (operador) {
            case "+":
                resultado += numero;
                break;
            case "-":
                resultado -= numero;
                break;
            case "*":
                resultado *= numero;
                break;
            case "/":
                resultado /= numero;
                break;
            default:
                return;
        }
        operador = "";
    }
}
