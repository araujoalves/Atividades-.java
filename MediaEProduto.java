package MediaEProduto02;
import java.util.Scanner;

public class MediaEProduto {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = input.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = input.nextInt();

        System.out.println("A média aritmética é: " + calculaMedia(num1, num2));
        System.out.println("O produto dos números é: " + calculaProduto(num1, num2));
    }

    public static int calculaMedia(int num1, int num2) {
        int media = (num1 + num2) / 2;
        return media;
    }

    public static int calculaProduto(int num1, int num2) {
        int produto = num1 * num2;
        return produto;
    }
}

