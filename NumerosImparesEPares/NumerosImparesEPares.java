

//Escreva um programa que lê 5 números. Ao final, escreva primeiros todos os ímpares, depois todos os pares.


package NumerosImparesEPares;

import java.util.Scanner;
public class NumerosImparesEPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5]; // cria um array para armazenar os números

        System.out.println("Digite 5 números:");

        // lê os 5 números e armazena no array
        for (int i = 0; i < 5; i++) {
            System.out.print("Número #" + (i+1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // escreve primeiro os ímpares
        System.out.println("Números ímpares:");
        for (int numero : numeros) {
            if (numero % 2 != 0) {
                System.out.println(numero);
            }
        }

        // escreve depois os pares
        System.out.println("Números pares:");
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        }
    }


















}
