public class TesteVentilador {
    public static void main(String[] args) {
        Ventilador ventilador = new Ventilador(Ventilador.PRETO);

        System.out.println(ventilador); // Ventilador preto, desligado, velocidade 1

        ventilador.ligar();
        System.out.println(ventilador); // Ventilador preto, ligado, velocidade 1

        ventilador.mudarVelocidade(Ventilador.MEDIA);
        System.out.println(ventilador); // Ventilador preto, ligado, velocidade 2

        ventilador.mudarVelocidade(Ventilador.RAPIDA);
        System.out.println(ventilador); // Ventilador preto, ligado, velocidade 3
    }
}
