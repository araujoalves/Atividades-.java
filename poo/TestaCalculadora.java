package poo;

public enum TestaCalculadora {
    ;


    public static void main(final String[] args) {

//        Calculadora calculadora = new Calculadora();
//
//        calculadora.entrada(55);
//        calculadora.setOperador("+");
//        calculadora.entrada(5);
//        calculadora.setOperador("*");
//        calculadora.entrada(2);
//        double resulado = calculadora.getResultado();
//        System.out.println(resulado);


        final CalculadoraV2 calc = new CalculadoraV2();

//        calc.entrada(55);
//        calc.setOperador(TipoOperador.SOMA);
//        calc.entrada(10);
//        double result = calc.getResultado();

        calc.entrada(55);
        calc.setOperador(TipoOperador.RAIZ_QUADRADA);
        calc.entrada(10);
        final double result = calc.getResultado();

        System.out.println(result);

    }
}
