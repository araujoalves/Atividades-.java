package poo;

public enum TipoOperador {

    NENHUM(""), SOMA("+"), SUBTRACAO("-"), MULTIPLICACAO("*"), DIVISAO("/"),
    RAIZ_QUADRADA("#");

    private final String sinal;

    TipoOperador(final String sinal) {
        this.sinal = sinal;
    }

    public static double calcular(final TipoOperador tipo, final double num1, final double num2) {
        switch (tipo) {
            case SOMA:
                return num1 + num2;
            case SUBTRACAO:
                return num1 - num2;
            case MULTIPLICACAO:
                return num1 * num2;
            case DIVISAO:
                if (0 == num2) {
                    throw new RuntimeException("Nao é permitido divisao por 0");
                }
                return num1 / num2;
            case RAIZ_QUADRADA:
                return num1 * 2 + num2;
        }
        return 0;
    }
}
