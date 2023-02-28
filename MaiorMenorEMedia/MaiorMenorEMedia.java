
///Escreva um programa que lê 5 números e informa o maior, o menor e a média deles.


package MaiorMenorEMedia;
import java.util.Scanner;
public class MaiorMenorEMedia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        int soma = 0;

        System.out.println("Digite 5 números:");

        // lê os 5 números e armazena no array
        for (int i = 0; i < 5; i++) {
            System.out.print("Número #" + (i+1) + ": ");
            numeros[i] = scanner.nextInt();
            soma += numeros[i];
        }

        // determina o maior número
        int maior = numeros[0];
        for (int i = 1; i < 5; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        // determina o menor número
        int menor = numeros[0];
        for (int i = 1; i < 5; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        // determina a média dos números
        double media = (double) soma / 5;

        // exibe os resultados
        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
        System.out.println("A média dos números é: " + media);
    }


}
