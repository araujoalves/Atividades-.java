import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TV tv = new TV();
        ControleRemoto controleRemoto = new ControleRemoto(tv);
        Menu menu = new Menu(controleRemoto);
        Scanner scanner = new Scanner(System.in);

        int opcao = -1;

        while (opcao != 0) {
            menu.exibir();
            opcao = lerInteiro("Digite a opção desejada: ");
            menu.selecionar(opcao);
            pressionarEnterParaContinuar();
        }

        scanner.close();
    }

    private static int lerInteiro(String mensagem) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(mensagem);
        int valor = scanner.nextInt();
        return valor;
    }

    private static void pressionarEnterParaContinuar() {
        System.out.print("Pressione ENTER para continuar...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
}