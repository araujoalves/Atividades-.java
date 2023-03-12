
import java.util.Scanner;

public class AumentoSalario {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário do colaborador: ");
        double salario = sc.nextDouble();

        double percentual;
        if (salario <= 280) {
            percentual = 0.2;
        } else if (salario <= 700) {
            percentual = 0.15;
        } else if (salario <= 1500) {
            percentual = 0.1;
        } else {
            percentual = 0.05;
        }

        double aumento = salario * percentual;
        double novoSalario = salario + aumento;

        System.out.println("Salário antes do reajuste: R$" + salario);
        System.out.println("Percentual de aumento aplicado: " + (percentual * 100) + "%");
        System.out.println("Valor do aumento: R$" + aumento);
        System.out.println("Novo salário após o aumento: R$" + novoSalario);

        sc.close();
    }
}
