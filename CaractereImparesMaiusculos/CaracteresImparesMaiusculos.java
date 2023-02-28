
//Escreva um programa que lê uma palavra e escreve de volta com os caracteres das posições ímpares em maiúsculo.

package CaractereImparesMaiusculos;
import java.util.Scanner;

public class CaracteresImparesMaiusculos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();
        StringBuilder novaPalavra = new StringBuilder();

        for (int i = 0; i < palavra.length(); i++) {
            char caracter = palavra.charAt(i);
            if (i % 2 == 1) { // verifica se o índice é ímpar
                caracter = Character.toUpperCase(caracter);
            }
            novaPalavra.append(caracter);
        }

        System.out.println("A nova palavra é: " + novaPalavra.toString());
    }

}
