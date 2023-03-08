package ImparEpar;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public enum Resultado {
    ;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in, StandardCharsets.UTF_8);

        System.out.print("Digite um número: ");

        int num = input.nextInt();

        ParOuImpar numero = new ParOuImpar(num);

        System.out.println(num + (numero.ehPar() ? " é par" : " é ímpar"));

        input.close();
    }
}

