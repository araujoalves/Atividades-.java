//Escreva um programa que lê o nome de 5 pessoas e armazena numa lista de convidados. Ao final, informe qual o nome mais longo presente na lista.

package NomeMaisLongo;

import java.util.ArrayList;

import java.util.Scanner;

public class NomeMaisLongo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> convidados = new ArrayList<>();

        System.out.println("Digite o nome de 5 convidados:");

        // lê os nomes e armazena na lista de convidados
        for (int i = 0; i < 5; i++) {
            System.out.print("Convidado #" + (i+1) + ": ");
            String nome = scanner.nextLine();
            convidados.add(nome);
        }

        // determina o nome mais longo
        String nomeMaisLongo = convidados.get(0);
        for (int i = 1; i < convidados.size(); i++) {
            String nomeAtual = convidados.get(i);
            if (nomeAtual.length() > nomeMaisLongo.length()) {
                nomeMaisLongo = nomeAtual;
            }
        }

        // exibe o nome mais longo
        System.out.println("O nome mais longo na lista de convidados é: " + nomeMaisLongo);
    }

}
