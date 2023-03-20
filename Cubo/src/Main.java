public class Main {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(2.5);
        System.out.println("Área do quadrado: " + quadrado.area());

        Cubo cubo = new Cubo(2.5, 3.0);
        System.out.println("Volume do cubo: " + cubo.calcularVolume());
    }
}