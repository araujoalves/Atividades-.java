package FolhaDePagamento;

import java.util.Scanner;

public class FolhaDePagamento {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor da hora trabalhada: ");
        double valorHora = input.nextDouble();

        System.out.print("Digite a quantidade de horas trabalhadas no mês: ");
        double qtdHoras = input.nextDouble();

        double salarioBruto = valorHora * qtdHoras;
        double descontoINSS = salarioBruto * 0.1;
        double fgts = salarioBruto * 0.11;
        double totalDescontos = 0;
        double descontoIR = 0;

        if (salarioBruto <= 900) {
            descontoIR = 0;
        } else if (salarioBruto <= 1500) {
            descontoIR = salarioBruto * 0.05;
        } else if (salarioBruto <= 2500) {
            descontoIR = salarioBruto * 0.1;
        } else {
            descontoIR = salarioBruto * 0.2;
        }

        totalDescontos = descontoIR + descontoINSS;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.printf("Salário Bruto: (%.2f * %.2f)        : R$ %.2f\n", valorHora, qtdHoras, salarioBruto);
        System.out.printf("(-) IR (%.0f%%)                     : R$ %.2f\n", descontoIR/salarioBruto*100, descontoIR);
        System.out.printf("(-) INSS (10%%)                    : R$ %.2f\n", descontoINSS);
        System.out.printf("FGTS (11%%)                        : R$ %.2f\n", fgts);
        System.out.printf("Total de descontos                 : R$ %.2f\n", totalDescontos);
        System.out.printf("Salário Líquido                    : R$ %.2f\n", salarioLiquido);
    }
}

