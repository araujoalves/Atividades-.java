public class Quadrado {
        private final double lado;

        public Quadrado(double lado) {
            this.lado = lado;
        }

        public double getLado() {
            return lado;
        }

        public double calcularPerimetro() {
            return 4 * lado;
        }

        public double calcularArea() {
            return lado * lado;
        }
    }


