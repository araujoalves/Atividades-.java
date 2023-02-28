package util;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {

        System.out.println("Inicio da aplicação");

        System.out.println("informe o mês do seu nascimento:");

        Scanner sc = new Scanner(System.in);

        String mes = sc.nextLine();

        Meses mesDigitado = Meses.valueOf(mes.toUpperCase());

        switch (mesDigitado){

            case JANEIRO:
                System.out.println("o mes informado foi " + mes);
                break;

            case MARCO:
                System.out.println("o mes informado foi " + mes);
                break;

            case SETEMBRO:
                System.out.println("o mes informado foi " + mes);
                break;
            default:
                System.out.println("Mes nao existe");

        }

        System.out.println("Fim da aplicação");




    }





}
