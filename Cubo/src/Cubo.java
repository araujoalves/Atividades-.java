public class Cubo extends Quadrado {
    private double comprimento;

    public Cubo(double lado, double comprimento) {
        super(lado);
        this.comprimento = comprimento;
    }

    public double calcularVolume() {
        double areaQuadrado = super.area();
        double volume = areaQuadrado * comprimento;
        return volume;
    }
}
