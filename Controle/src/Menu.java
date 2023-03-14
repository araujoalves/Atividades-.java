import java.util.Scanner;

public class Menu {
    private ControleRemoto controleRemoto;
    private Scanner scanner;

    public Menu(ControleRemoto controleRemoto) {
        this.controleRemoto = controleRemoto;
        this.scanner = new Scanner(System.in);
    }

    public void exibir() {
        System.out.println("----- MENU -----");
        System.out.println("1. Ligar TV");
        System.out.println("2. Desligar TV");
        System.out.println("3. Mudar canal");
        System.out.println("4. Aumentar volume");
        System.out.println("5. Diminuir volume");
        System.out.println("6. Ver canal");
        System.out.println("7. Ver volume");
        System.out.println("0. Sair");
        System.out.println("-----------------");
    }

    public void selecionar(int opcao) {
        switch (opcao) {
            case 1:
                this.controleRemoto.ligarTV();
                break;
            case 2:
                this.controleRemoto.desligarTV();
                break;
            case 3:
                int canal = lerInteiro("Digite o canal desejado: ");
                this.controleRemoto.mudarCanal(canal);
                break;
            case 4:
                this.controleRemoto.aumentarVolume();
                break;
            case 5:
                this.controleRemoto.diminuirVolume();
                break;
            case 6:
                System.out.println("Canal: " + this.controleRemoto.getCanal());
                break;
            case 7:
                System.out.println("Volume: " + this.controleRemoto.getVolume());
                break;
            case 0:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }

    public int lerInteiro(String mensagem) {
        System.out.print(mensagem);
        int valor = this.scanner.nextInt();
        this.scanner.nextLine(); // Consumir o \n deixado pelo nextInt()
        return valor;
    }
}
