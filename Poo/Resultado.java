package Poo;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public enum Resultado {
    ;

    public static void main(final String[] args) {

        final Scanner input = new Scanner(System.in, StandardCharsets.UTF_8);

        System.out.print("Digite um número: ");

        final int num = input.nextInt();

        final ParOuImpar numero = new ParOuImpar(num);

        System.out.println(num + (numero.ehPar() ? " é par" : " é ímpar"));

        input.close();
    }
}

