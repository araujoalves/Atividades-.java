package NotasTurma;

public class NotasTurma {
    public static void main(String[] args) {
        String[] alunos = new String[]{"Jason", "Kimberly", "Zack", "Trini", "Billy", "Tommy"};
        double[][] notas = new double[][]{
                {9.5, 7.0, 8.0, 7.5},
                {6.0, 7.0, 8.0, 9.0},
                {8.0, 7.0, 8.5, 7.5},
                {0.5, 10.0, 9.75, 9.0},
                {9.75, 9.5, 9.0, 9.5},
                {5.5, 4.5, 3.0, 7.0}
        };

        // Calcula a média de cada aluno
        for (int i = 0; i < alunos.length; i++) {
            double soma = 0;
            for (int j = 0; j < notas[i].length; j++) {
                soma += notas[i][j];
            }
            double media = soma / notas[i].length;
            System.out.println(alunos[i] + " - Média: " + media);
        }

        // Calcula a média da turma
        double somaTurma = 0;
        int totalNotas = 0;
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                somaTurma += notas[i][j];
                totalNotas++;
            }
        }
        double mediaTurma = somaTurma / totalNotas;
        System.out.println("Média da turma: " + mediaTurma);

        // Encontra a maior nota de cada aluno e o bimestre correspondente
        for (int i = 0; i < alunos.length; i++) {
            double maiorNota = 0;
            int bimestreMaiorNota = 0;
            for (int j = 0; j < notas[i].length; j++) {
                if (notas[i][j] > maiorNota) {
                    maiorNota = notas[i][j];
                    bimestreMaiorNota = j + 1;
                }
            }
            System.out.println(alunos[i] + " - Maior nota: " + maiorNota + " no bimestre " + bimestreMaiorNota);
        }

        // Encontra a pior nota de cada aluno e o bimestre correspondente
        for (int i = 0; i < alunos.length; i++) {
            double piorNota = 10;
            int bimestrePiorNota = 0;
            for (int j = 0; j < notas[i].length; j++) {
                if (notas[i][j] < piorNota) {
                    piorNota = notas[i][j];
                    bimestrePiorNota = j + 1;
                }
            }
            System.out.println(alunos[i] + " - Pior nota: " + piorNota + " no bimestre " + bimestrePiorNota);
        }
    }

}
