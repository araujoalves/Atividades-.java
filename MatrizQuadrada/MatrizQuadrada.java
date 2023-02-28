//Deve ser solicitado ao usuário o tamanho da matriz a ser criada. Após o input do usuário de ser criado uma matriz quadrada com as informações obtidas. Exemplo: O usuário informou o valor 3 então teremos.
//
//[][][]
//[][][]
//[][][]

package MatrizQuadrada;
import java.util.Scanner;
public class MatrizQuadrada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Solicita ao usuário o tamanho da matriz
        System.out.print("Informe o tamanho da matriz: ");
        int tamanho = input.nextInt();

        // Cria a matriz quadrada com o tamanho informado pelo usuário
        int[][] matriz = new int[tamanho][tamanho];

        // Imprime a matriz na tela
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.print("[]");
            }
            System.out.println();
        }
    }

}
