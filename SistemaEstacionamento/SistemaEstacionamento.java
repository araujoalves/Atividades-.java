package SistemaEstacionamento;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SistemaEstacionamento {
    private final int capacidade;
    private Map<String, LocalDateTime> entradas;
    private Map<String, LocalDateTime> saidas;
    private Map<String, Integer> tempos;

    public SistemaEstacionamento(int capacidade) {
        this.capacidade = capacidade;
       this.entradas = new HashMap<>();
       this.saidas = new HashMap<>();
       this.tempos = new HashMap<>();
    }
    public void registrarEntrada(String placa) {
        if (this.entradas.containsKey(placa)) {
            System.out.println("Entrada já registrada para a placa " + placa);
        } else if (this.entradas.size() >= capacidade) {
            System.out.println("Capacidade máxima do estacionamento atingida");
        } else {
            entradas.put(placa, LocalDateTime.now());
            System.out.println("Entrada do veículo de placa: " + placa);
        }

    }

    public void registrarSaida(String placa) {
        if (!this.entradas.containsKey(placa)) {
            System.out.println("Não há entrada registrada para a placa " + placa);
        } else if (saidas.containsKey(placa)) {
            System.out.println("Saída já registrada para a placa " + placa);
        } else {
            LocalDateTime entrada = this.entradas.get(placa);
            LocalDateTime saida = LocalDateTime.now();
            saidas.put(placa, saida);
            Duration duracao = Duration.between(entrada, saida);
            int minutos = (int) duracao.toMinutes();
            tempos.put(placa, minutos);
            int valor = calcularValor(minutos);
            System.out.println("Saída do veículo de placa: " + placa +
                    ". Tempo no estabelecimento: " + minutos + " minutos. Valor a ser cobrado: R$ " + valor);
        }
    }
    private int calcularValor(int minutos) {
        if (minutos <= 5) {
            return 0;
        } else if (minutos <= 60) {
            return 4;
        } else {
            int horas = (int) Math.ceil((minutos - 60) / 60.0);
            return 4 + (6 * horas);
        }
    }

    public void imprimirRelatorio() {
        System.out.println("Veículos que ainda não saíram:");
        for (Map.Entry<String, LocalDateTime> entrada : entradas.entrySet()) {
            String placa = entrada.getKey();
            LocalDateTime horaEntrada = entrada.getValue();
            int minutos = (int) Duration.between(horaEntrada, LocalDateTime.now()).toMinutes();
            System.out.println("- " + placa + " (tempo de permanência: " + minutos + " minutos)");
        }
        System.out.println("Veículos que já saíram:");
        for (Map.Entry<String, Integer> saida : tempos.entrySet()) {
            String placa = saida.getKey();
            int minutos = saida.getValue();
            System.out.println("- " + placa + " (tempo de permanência: " + minutos + " minutos)");
        }
    }
    public static void main(String[] args) {
        SistemaEstacionamento estacionamento = new SistemaEstacionamento(2);
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Registrar entrada de veículo");
            System.out.println("2. Registrar saída de veículo");
            System.out.println("3. Imprimir relatório");
            System.out.println("0. Sair");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do scanner
            switch (opcao) {
                case 1:
                    System.out.println("Digite a placa do veículo:");
                    String placaEntrada = scanner.nextLine();
                    estacionamento.registrarEntrada(placaEntrada);
                    break;
                case 2:
                    System.out.println("Digite a placa do veículo:");
                    String placaSaida = scanner.nextLine();
                    estacionamento.registrarSaida(placaSaida);
                    break;
                case 3:
                    estacionamento.imprimirRelatorio();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 0);


    }
    
    }
