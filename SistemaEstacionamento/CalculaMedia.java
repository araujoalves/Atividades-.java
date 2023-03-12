package CalculaMedia;
import java.util.Scanner;

    public class CalculaMedia {


        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            double nota1, nota2, media;

            System.out.print("Digite a primeira nota: ");
            nota1 = sc.nextDouble();

            System.out.print("Digite a segunda nota: ");
            nota2 = sc.nextDouble();

            media = (nota1 + nota2) / 2;

            if (media == 10) {
                System.out.println("Aprovado com Distinção");
            } else if (media >= 7) {
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
            }

            sc.close();
        }
}
