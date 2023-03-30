package projeto_Car_Rental;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Alugar aluguel = new Alugar();

        Carro carro1 = new Carro("Sedan", "Prata", 2020);
        Carro carro2 = new Carro("Hatch", "Preto", 2018);
        Carro carro3 = new Carro("SUV", "Branco", 2022);

        System.out.println("Bem-vindo ao sistema de aluguel de carros!");
        int opcao = 0;

        while (opcao != 3) {
            System.out.println("\nSelecione uma opção:");
            System.out.println("1 - Alugar carro");
            System.out.println("2 - Devolver carro");
            System.out.println("3 - Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    if (aluguel.isAlugado()) {
                        System.out.println("Um carro já foi alugado!");
                    } else {
                        System.out.println("Selecione um carro:");
                        System.out.println("1 - Sedan Prata 2020");
                        System.out.println("2 - Hatch Preto 2018");
                        System.out.println("3 - SUV Branco 2022");
                        int carroSelecionado = scanner.nextInt();

                        switch (carroSelecionado) {
                            case 1:
                                aluguel.alugarCarro(carro1);
                                break;
                            case 2:
                                aluguel.alugarCarro(carro2);
                                break;
                            case 3:
                                aluguel.alugarCarro(carro3);
                                break;
                            default:
                                System.out.println("Carro inválido!");
                        }

                        if (aluguel.isAlugado()) {
                            System.out.println("Carro alugado com sucesso!");
                        }
                    }
                    break;
                case 2:
                    if (!aluguel.isAlugado()) {
                        System.out.println("Nenhum carro foi alugado!");
                    } else {
                        Carro carroAlugado = aluguel.getCarro();
                        aluguel.devolverCarro();
                        System.out.println("Carro " + carroAlugado.getTipo() + " " + carroAlugado.getCor() + " " + carroAlugado.getAno() + " devolvido com sucesso!");
                    }
                    break;
                case 3:
                    System.out.println("Saindo do sistema de aluguel de carros...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }
}
