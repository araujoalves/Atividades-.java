package MediaPonderadaAtividade;
import java.util.Scanner;
public class MediaPondera02 {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            int peso1, peso2, matricula;

            double nota1, nota2, media;

            System.out.print("Digite o peso da primeira prova: ");
            peso1 = input.nextInt();

            System.out.print("Digite o peso da segunda prova: ");
            peso2 = input.nextInt();

            System.out.print("Digite a matrícula do aluno: ");
            matricula = input.nextInt();

            System.out.print("Digite a nota da primeira prova: ");
            nota1 = input.nextDouble();

            System.out.print("Digite a nota da segunda prova: ");
            nota2 = input.nextDouble();

            media = calculaMediaPonderada(nota1, peso1, nota2, peso2);

            System.out.printf("Matrícula: %d, Média: %.2f\n", matricula, media);
        }

        public static double calculaMediaPonderada(double nota1, int peso1, double nota2, int peso2) {
            double media = ((nota1 * peso1) + (nota2 * peso2)) / (peso1 + peso2);
            return media;
        }
    }










