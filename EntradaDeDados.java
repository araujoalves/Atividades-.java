package entraDeDados;

import java.util.Scanner;
public class EntradaDeDados {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // leitura dos pesos das provas
            System.out.print("Digite o peso da primeira prova: ");
            int peso1 = sc.nextInt();
            System.out.print("Digite o peso da segunda prova: ");
            int peso2 = sc.nextInt();

            // leitura dos dados do aluno
            System.out.print("Digite a matrícula do aluno: ");
            int matricula = sc.nextInt();
            System.out.print("Digite a nota da primeira prova: ");
            double nota1 = sc.nextDouble();
            System.out.print("Digite a nota da segunda prova: ");
            double nota2 = sc.nextDouble();

            // cálculo da média ponderada
            double media = calculaMediaPonderada(nota1, nota2, peso1, peso2);

            // exibição do resultado
            System.out.printf("Matrícula: %d%n", matricula);
            System.out.printf("Média: %.2f%n", media);

            sc.close();
        }

        public static double calculaMediaPonderada(double nota1, double nota2, int peso1, int peso2) {
            int produto1 = calculaProduto((int) nota1, peso1);
            int produto2 = calculaProduto((int) nota2, peso2);
            int somaProdutos = produto1 + produto2;
            int somaPesos = peso1 + peso2;
            return (double) somaProdutos / somaPesos;
        }

        public static int calculaProduto(int num1, int num2) {
            return num1 * num2;
        }

    }




