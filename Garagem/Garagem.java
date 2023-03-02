package Garagem;

import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public enum Garagem {
    ;

    private static String logSaidas = "";

    public static void main(final String[] args) {

        final Scanner sc = new Scanner(System.in, StandardCharsets.UTF_8);
        System.out.println("Informe a capacidade do estacionamento");
        final int capacidade = sc.nextInt(); //5

        final String[] placas = new String[capacidade];
        final LocalDateTime[] tempos = new LocalDateTime[capacidade];

        int opcao = 0;
        do {
            System.out.println("Opções");
            System.out.println("1 - Solicitar Placa");
            System.out.println("2 - Sair do Sistema");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Informe a placa");
                    final String placa = sc.next();
                    Garagem.programa(placa, placas, tempos);
                    break;
                case 2:
                    System.out.println("Obrigado!");
                    break;
                default:
                    System.out.println("Opção Invalida");
            }

        } while (2 != opcao);

    }

    public static void programa(final String placa, final String[] placas, final LocalDateTime[] tempos) {
        final int posicao = Garagem.verificaPlaca(placa, placas);

        if (-1 == posicao) {
            Garagem.entradaVeiculo(placa, placas, tempos);
        } else {
            Garagem.saidaVeiculo(posicao, placas, tempos);
        }

        //imprimir relatorio
        Garagem.imprimirRelatorio(placas, tempos);

    }

    private static void imprimirRelatorio(final String[] placas, final LocalDateTime[] tempos) {

        System.out.println("_______________________________________________________________________________");
        System.out.println("Veículos no estacionamento: ");

        //Percorre o array para mostrar os veiculos no estacionamento
        for (int i = 0; i < placas.length; i++) {
            final String placa = placas[i];

            if (null == placa) {
                continue;
            }

            final LocalDateTime dataHoraEntrada = tempos[i];
            final String dataFormatada = dataHoraEntrada.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
            System.out.printf("\tPlaca %s \t Hora de entrada: %s %n", placa, dataFormatada);
        }

        //Mostra o log de saidas
        System.out.println();
        System.out.println("Relatorio de Saidas: ");
        System.out.printf("%s %n", Garagem.logSaidas);

    }

    private static void saidaVeiculo(final int posicao, final String[] placas, final LocalDateTime[] tempos) {

        final String placa = placas[posicao];
        final LocalDateTime entrada = tempos[posicao];
        final LocalDateTime saida = LocalDateTime.now();

        final long minutos = Duration.between(entrada, saida).toSeconds();

        final double valorPagar = Garagem.calcularValorPagar(minutos);

        System.out.printf("Saída do veículo placa %s. Tempo no estacionamento %s segundos. Valor a ser cobrado: %.2f %n",
                placa, minutos, valorPagar);

        final String historico = String.format("\tPlaca %s - tempo permanência: %d segundos - valor cobrado: %.2f %n", placa,
                minutos, valorPagar);

        Garagem.logSaidas += historico;

        placas[posicao] = null;
        tempos[posicao] = null;

    }

    private static double calcularValorPagar(final long segundo) {

        //• De 0 a 5 minutos. Sem cobrança de valor
        //• De 5 a 60 minutos. R$ 4,00
        //• Acima de 60 minutos é cobrado um valor de R$ 6,00 por hora adicional.
        //• Se ficou 1 hora e 1 minuto paga 4 pela primeira hora mais 6 pela hora adicional

        if (5 >= segundo) {
            return 0.0;
        } else if (5 < segundo && 60 >= segundo) {
            return 4.0;
        } else {
            double valorPagar = 4.0;
            //Divide o tempo em minutos para saber o valor em horas
            // 125/60 = 2.08, entao foram 2.08 horas de permanencia
            // 1 hora = 4 reais
            // 1 hora = 6 reais
            // 0.8 hora = 6 reais
            double horas = (segundo / 60.0);

            //Decrementa a primeira hora que tem o valor fixo de 4 reais
            horas--;

            //Arredonta o valor para cima
            horas = Math.ceil(horas);

            //Multiplica o valor pelo número de horas adicionais
            final double valorAdicinal = (horas * 6.00);

            //Soma o valor adicionao ao valo da hora inicial
            valorPagar = valorPagar + valorAdicinal;

            return valorPagar;
        }
    }

    private static void entradaVeiculo(final String placa, final String[] placas, final LocalDateTime[] tempos) {

        final int posLivre = Garagem.posicaoLivre(placas);
        if (-1 == posLivre) {
            System.out.println("Não ha vagas");
        } else {
            final LocalDateTime horaEntrada = LocalDateTime.now();
            placas[posLivre] = placa;
            tempos[posLivre] = horaEntrada;
            System.out.printf("Entrada do veículo de placa: %s realizada.%n", placa);
        }
    }

    private static int posicaoLivre(final String[] placas) {
        for (int i = 0; i < placas.length; i++) {
            final String valor = placas[i];
            if (null == valor) {
                return i;
            }
        }
        return -1;
    }

    private static int verificaPlaca(final String placa, final String[] placas) {
        int posicao = -1;
        for (int i = 0; i < placas.length; i++) {
            final String valor = placas[i];
            if (null != valor) {
                if (valor.equals(placa)) {
                    posicao = i;
                }
            }
        }
        return posicao;
    }

}
