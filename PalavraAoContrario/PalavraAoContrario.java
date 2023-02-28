
//Escreva um programa que lê uma palavra e a escreve de volta ao contario

package PalavraAoContrario;

import java.util.Scanner;
public class PalavraAoContrario {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        StringBuilder palavraInvertida = new StringBuilder(palavra);
        palavraInvertida = palavraInvertida.reverse();

        // exibe a palavra invertida
        System.out.println("Palavra invertida: " + palavraInvertida);
    }

}
