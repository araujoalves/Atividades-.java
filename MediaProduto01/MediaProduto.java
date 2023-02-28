import java.util.Scanner;
public class MediaProduto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();

        double media = calculaMedia(num1, num2);
        int produto = calculaProduto(num1, num2);

        System.out.println("A média aritmética dos números é: " + media);
        System.out.println("O produto dos números é: " + produto);
    }

        public static double calculaMedia(int num1, int num2) {
          return (double) (num1 + num2) / 2;
    }

       public static int calculaProduto(int num1, int num2) {
        return num1 * num2;
    }


}




