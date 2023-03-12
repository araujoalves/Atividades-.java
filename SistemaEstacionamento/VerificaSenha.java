
// Faça um código que solicite uma senha formada de 4 números inteiros, caso a senha esteja correta apresente a mensagem:
//
//"Senha correta", caso contrário apresente a mensagem: "Senha inválida, tente novamente!"
//
//Obs: a senha de comparação, você mesmo pode definir. E o programa termina somente quando a senha correta for digitada

package Senha;

import java.util.Scanner;
public class VerificaSenha {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int senhaCorreta = 1234;
        int tentativa;
        boolean senhaValida = false;

        while (!senhaValida) {
            System.out.print("Digite a senha (4 números inteiros): ");
            tentativa = scanner.nextInt();
            if (tentativa == senhaCorreta) {
                System.out.println("Senha correta");
                senhaValida = true;
            } else {
                System.out.println("Senha inválida, tente novamente!");
            }
        }
        scanner.close();

    }
















}
