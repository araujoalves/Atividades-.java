
//Faça um programa que peça para um usuário digitar um número e que só finaliza quando o usuário digitar 0.
package Usuariodigite;

import java.util.Scanner;
public class UsuarioDigite {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            int num;

            do {
                System.out.print("Digite um número (digite 0 para finalizar): ");
                num = scanner.nextInt();
                break;
            }while (num != 0) ;

            System.out.println("Programa finalizado.");


        }
    }















