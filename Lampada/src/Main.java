import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lampada minhaLampada = new Lampada(60);

        System.out.println("Deseja ligar a lâmpada? Digite 's' para SIM ou 'n' para NÃO:");
        String resposta = scanner.nextLine();

        if (resposta.equals("s")) {
            minhaLampada.ligar();
            System.out.println("A lâmpada está ligada? " + minhaLampada.getEstado());

            System.out.println("Deseja ajustar a potência da lâmpada? Digite 's' para SIM ou 'n' para NÃO:");
            resposta = scanner.nextLine();

            if (resposta.equals("s")) {
                System.out.println("Digite a nova potência (em watts):");
                int novaPotencia = scanner.nextInt();
                minhaLampada.setPotencia(novaPotencia);
            }

            System.out.println("Deseja desligar a lâmpada? Digite 's' para SIM ou 'n' para NÃO:");
            resposta = scanner.next();

            if (resposta.equals("s")) {
                minhaLampada.desligar();
                System.out.println("A lâmpada está ligada? " + minhaLampada.getEstado());
            }
        }

        scanner.close();
    }
}