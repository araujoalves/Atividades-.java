package br.com.first.comandagenerator;

import java.util.Scanner;
public class Main {
    private static final int OPTION_FOR_CREATE_ORDER = 1;
    private static final int OPTION_FOR_UPDATE_ORDER = 2;
    private static final int OPTION_FOR_CLOSE_ORDER = 3;
    private static final int OPTION_FOR_EXIT = 4;


    public static void main(String[] args) {

        int option = renderAMenuAndPromptForOption();
        while (option != OPTION_FOR_EXIT) {
            switch (option) {
                case OPTION_FOR_CREATE_ORDER:
                    break;
                case OPTION_FOR_UPDATE_ORDER:
                    break;
                case OPTION_FOR_CLOSE_ORDER:
                    break;
                default:
                    System.out.println("Opção inválida");
            }
            option = renderAMenuAndPromptForOption();
        }
    }

    private  static  int renderAMenuAndPromptForOption(){
        System.out.println("COMANDA GENERATOR");
        System.out.println("O que você quer fazer?");
        System.out.println("1. Criar comanda");
        System.out.println("2. Atualizar valor da comanda");
        System.out.println("3. Encerrar comanda");
        System.out.println("4. Sair");
        Scanner scanner = new Scanner(System.in);
        return  scanner.nextInt();

    }
}