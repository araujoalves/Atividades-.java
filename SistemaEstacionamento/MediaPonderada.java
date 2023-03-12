package MediaPonderada01;

import java.util.Scanner;

public class MediaPonderada {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o peso da primeira prova: ");
        int peso1 = input.nextInt();

        System.out.print("Informe o peso da segunda prova: ");
        int peso2 = input.nextInt();

        System.out.print("Informe a matrícula do aluno: ");
        int matricula = input.nextInt();

        System.out.print("Informe a nota da primeira prova: ");
        double nota1 = input.nextDouble();

        System.out.print("Informe a nota da segunda prova: ");
        double nota2 = input.nextDouble();

        double media = calculaMediaPonderada(nota1, peso1, nota2, peso2);

        System.out.println("Matrícula: " + matricula);
        System.out.printf("Média: %.2f", media);

        input.close();
    }

    public static double calculaMediaPonderada(double nota1, int peso1, double nota2, int peso2) {
        return (nota1 * peso1 + nota2 * peso2) / (peso1 + peso2);
    }
}
