
//Escreva um programa que lê nome, altura e peso de 5 pessoas, calcula o IMC de cada um e ao final informa se alguém está fora do peso ideal (o IMC ideal é entre 18,5 e 25).

package CalculaOIMC;
import java.util.Scanner;
public class CalculaOIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numPessoas = 5;
        double imcIdealMin = 18.5;
        double imcIdealMax = 25.0;
        boolean temForaDoPesoIdeal = false;

        for (int i = 0; i < numPessoas; i++) {
            System.out.print("Digite o nome da pessoa #" + (i+1) + ": ");
            String nome = scanner.nextLine();
            System.out.print("Digite a altura de " + nome + " (em metros): ");
            double altura = scanner.nextDouble();
            System.out.print("Digite o peso de " + nome + " (em kg): ");
            double peso = scanner.nextDouble();
            scanner.nextLine(); // consome a quebra de linha deixada pelo nextDouble()

            double imc = peso / (altura * altura);

            System.out.printf("%s tem IMC %.2f%n", nome, imc);

            if (imc < imcIdealMin || imc > imcIdealMax) {
                System.out.println("Atenção: " + nome + " está fora do peso ideal!");
                temForaDoPesoIdeal = true;
            }
        }

        if (!temForaDoPesoIdeal) {
            System.out.println("Todos estão dentro do peso ideal!");
        }
    }
}
