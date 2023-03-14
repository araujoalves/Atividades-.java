public class Main {
    public static void main(String[] args) {
        // Teste do Quadrado
        Quadrado quadrado = new Quadrado(5);
        System.out.println("Lado do quadrado: " + quadrado.getLado());
        System.out.println("Perímetro do quadrado: " + quadrado.calcularPerimetro());
        System.out.println("Área do quadrado: " + quadrado.calcularArea());

        // Teste do Retângulo
        Retangulo retangulo = new Retangulo(4, 6);
        System.out.println("Base do retângulo: " + retangulo.getBase());
        System.out.println("Altura do retângulo: " + retangulo.getAltura());
        System.out.println("Perímetro do retângulo: " + retangulo.calcularPerimetro());
        System.out.println("Área do retângulo: " + retangulo.calcularArea());
    }
}
