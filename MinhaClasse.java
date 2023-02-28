
import java.util.Scanner;

public class MinhaClasse  {

        public static void main(String[] args) {

            Scanner entrada = new Scanner(System.in);

            System.out.println("Digite o seu nome:");
            String nome = entrada.next();

            System.out.println("Digite o ano de nascimento:");
            int anoNascimento = entrada.nextInt();

            System.out.println("Digite a sua cidade:");
            String cidade = entrada.next();

            int idade = 2022 - anoNascimento;

            System.out.printf("Olá, %s. A sua idade é %d anos. A sua cidade é %s.", nome, idade, cidade);

        }

    }








