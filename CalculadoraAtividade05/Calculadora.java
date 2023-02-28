package CalculadoraAtividade05;

import java.util.Scanner;
    public class Calculadora {
            public class ParImpar {
                public static void main(String[] args) {

                    Scanner sc = new Scanner(System.in);
                    int num;

                    do {
                        System.out.print("Digite um número: ");
                        num = sc.nextInt();

                        if (num % 2 == 0) {
                            System.out.println("Número par. Encerrando o programa...");
                            break;
                        }
                    } while (true);
                }
            }

        }
















