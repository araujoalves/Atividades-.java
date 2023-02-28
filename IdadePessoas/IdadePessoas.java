
//Escreva um programa que lê nome e idade de 5 pessoas e ao final informa quem é o mais novo, o mais velho e qual a média de idade.

package IdadePessoas;

import java.util.Scanner;
public class IdadePessoas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int idadeTotal = 0;
        int idadeMaisNova = Integer.MAX_VALUE;
        int idadeMaisVelha = Integer.MIN_VALUE;
        String nomeMaisNovo = "";
        String nomeMaisVelho = "";

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome da pessoa #" + (i+1) + ": ");
            String nome = scanner.nextLine();
            System.out.print("Digite a idade de " + nome + ": ");
            int idade = scanner.nextInt();
            scanner.nextLine(); // consome a quebra de linha deixada pelo nextInt()

            idadeTotal += idade;

            if (idade < idadeMaisNova) {
                idadeMaisNova = idade;
                nomeMaisNovo = nome;
            }

            if (idade > idadeMaisVelha) {
                idadeMaisVelha = idade;
                nomeMaisVelho = nome;
            }
        }

        double mediaIdade = idadeTotal / 5.0;

        System.out.println("A pessoa mais nova é " + nomeMaisNovo + " com " + idadeMaisNova + " anos.");
        System.out.println("A pessoa mais velha é " + nomeMaisVelho + " com " + idadeMaisVelha + " anos.");
        System.out.println("A média de idade das pessoas é " + mediaIdade + " anos.");
    }


}
