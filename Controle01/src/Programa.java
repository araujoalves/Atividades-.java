public class Programa {
    public static void main(String[] args) {
        Televisao tv = new Televisao();
        ControleRemoto controle = new ControleRemoto(tv);
        // aumentando o volume
        controle.aumentarVolume();
        controle.aumentarVolume();

        // trocando para o canal 5
        controle.trocarParaCanal(5);

        // diminuindo o canal e o volume
        controle.diminuirCanal();
        controle.diminuirVolume();

        // consultando o status da televisão
        controle.consultarStatus();
    }
}

