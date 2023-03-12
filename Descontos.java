package Descontos;
import java.util.Scanner;

public class Descontos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do salário bruto: ");
        double salarioBruto = scanner.nextDouble();

        double inss = calcularINSS(salarioBruto);
        double fgts = calcularFGTS(salarioBruto);
        double planoSaude = 100.0;

        double salarioLiquido = salarioBruto - inss - fgts - planoSaude;

        System.out.printf("INSS: R$%.2f\n", inss);
        System.out.printf("FGTS: R$%.2f\n", fgts);
        System.out.printf("Plano de Saúde: R$%.2f\n", planoSaude);
        System.out.printf("Salário Líquido: R$%.2f\n", salarioLiquido);
    }

    public static double calcularINSS(double salarioBruto) {
        return salarioBruto * 0.1;
    }

    public static double calcularFGTS(double salarioBruto) {
        return salarioBruto * 0.08;
    }
}
