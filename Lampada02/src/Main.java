

    public class Main {
        public static void main(String[] args) {
            Lampada minhaLampada = new Lampada(60, "LED");

            Interruptor meuInterruptor = new Interruptor(minhaLampada);

            meuInterruptor.ligar();

            if (minhaLampada.isAcesa()) {
                System.out.println("A lâmpada está acesa!");
            } else {
                System.out.println("A lâmpada está desligada.");
            }

            meuInterruptor.desligar();

            if (minhaLampada.isAcesa()) {
                System.out.println("A lâmpada está acesa!");
            } else {
                System.out.println("A lâmpada está desligada.");
            }
        }
    }
