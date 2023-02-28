
//Escreva um programa que lê o nome de 5 frutas e armazena num carrinho de compras. Ao final da entrada dos 5 itens, exiba a lista completa.
package CarrinhoDeCompras;

import java.util.Scanner;
public class CarrinhoDeCompras {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] carrinho = new String[5];

        System.out.println("Banana, Açaí, Abacate, Abacaxi, Acerola");

        // lê o nome das 5 frutas e armazena no array
        for (int i = 0; i < 5; i++) {
            System.out.print("Fruta #" + (i+1) + ": ");
            carrinho[i] = scanner.nextLine();
        }

        // exibe a lista completa
        System.out.println("Lista de frutas no carrinho:");
        for (String fruta : carrinho) {
            System.out.println(fruta);
        }
    }

}
