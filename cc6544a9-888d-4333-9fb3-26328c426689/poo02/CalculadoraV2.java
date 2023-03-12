package poo;

public class CalculadoraV2 {

    private double resultado;
    private TipoOperador operador = TipoOperador.NENHUM;

    public void entrada(double valor){
        if (operador.equals(TipoOperador.NENHUM)){
            resultado = valor;
        }else{
            calcular(valor);
        }
    }

    public void setOperador(TipoOperador operador){
        this.operador = operador;
    }

    public double getResultado(){
        return resultado;
    }

    private void calcular(double numero){
        resultado = TipoOperador.calcular(operador, resultado, numero);
        operador = TipoOperador.NENHUM;
    }

}
