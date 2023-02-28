package DadosDaAluna;

public class aluna {


    public static void main(String[] args) {
        String[][] alunos = new String[][]{
                {"João", "30", "Python", "Data Science"},
                {"Letícia", "23", "Javascript", "Web Full Stack - Frontend"},
                {"Pedro", "40", "Java", "Mobile"},
                {"Luciana", "25", "C#", "Web Full Stack - Backend"},
        };

        // Mostra todos os dados da aluna Luciana
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i][0].equals("Luciana")) {
                System.out.println("Dados da aluna Luciana:");
                System.out.println("Nome: " + alunos[i][0]);
                System.out.println("Idade: " + alunos[i][1]);
                System.out.println("Linguagem de programação: " + alunos[i][2]);
                System.out.println("Curso: " + alunos[i][3]);
            }
        }

        // Mostra a idade da aluna Letícia
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i][0].equals("Letícia")) {
                System.out.println("Idade da aluna Letícia: " + alunos[i][1]);
            }
        }

        // Modifica o curso do aluno Pedro de Mobile para Data Science
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i][0].equals("Pedro")) {
                alunos[i][3] = "Data Science";
                System.out.println("Novo curso do aluno Pedro: " + alunos[i][3]);
            }
        }
    }
}