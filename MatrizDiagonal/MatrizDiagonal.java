package MatrizDiagonal;

public class MatrizDiagonal {
    public static void main(String[] args) {
        int tamanho = 3;
        int[][] matriz = new int[tamanho][tamanho];

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                if (i == tamanho - j - 1) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println();
        }
    }
}
