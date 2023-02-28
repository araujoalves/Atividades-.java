///ocê deve contruir um algoritimo
//
//que deva receber o nome do aluno: deve receber o tipo da escola do aluno: Ex: PU (publica), PR (privada) MT (militar) OBS: O valor a ser informado pelo usuario deve ser a sigla PU, PR ou MT
//
//deve receber 5 notas Nota atividade 1 Nota atividade 2 Nota atividade 3 Nota Prova Nota Participação
//
//o valor da nota das atividade 1, 2 e 3 não podem ser maior que 10 o valor da nota da prova não pode ser maior que 50 o valor da nota de participação não pode ser maior que 20
//
//Para escolas Publicas é necessario 65% de pontos para ser aprovado Para escolas Privadas é necessario 70% de pontos para ser aprovado Para escolas Milirares é necessario 80% de pontos para ser aprovado
//
//E se a nota de participação for menor 5 independente das demais notas o aluno esta reprovado
//
//O sistema deve realizar a somatoria das notas identificar o tipo da escola e mostrar a mensagem "O Aluno XXXX foi APROVADO. Total de pontos: YY ou "O Aluno XXXX foi REPROVADO. Total de pontos: YY

package AprovacaoAluno;
import java.util.Scanner;
public class AprovacaoAluno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = input.nextLine();

        System.out.print("Digite o tipo de escola (PU, PR ou MT): ");
        String tipoEscola = input.nextLine();

        System.out.print("Digite a nota da atividade 1: ");
        double notaAtividade1 = input.nextDouble();

        System.out.print("Digite a nota da atividade 2: ");
        double notaAtividade2 = input.nextDouble();

        System.out.print("Digite a nota da atividade 3: ");
        double notaAtividade3 = input.nextDouble();

        System.out.print("Digite a nota da prova: ");
        double notaProva = input.nextDouble();

        System.out.print("Digite a nota de participação: ");
        double notaParticipacao = input.nextDouble();

        // Verifica se as notas estão dentro do intervalo correto
        if (notaAtividade1 > 10 || notaAtividade2 > 10 || notaAtividade3 > 10 ||
                notaProva > 50 || notaParticipacao > 20) {
            System.out.println("Erro: uma ou mais notas estão fora do intervalo permitido.");
            System.exit(0);
        }

        // Calcula a nota final do aluno
        double notaFinal = notaAtividade1 + notaAtividade2 + notaAtividade3 + notaProva + notaParticipacao;

        // Define a porcentagem necessária para a aprovação
        double porcentagemAprovacao;
        if (tipoEscola.equals("PU")) {
            porcentagemAprovacao = 0.65;
        } else if (tipoEscola.equals("PR")) {
            porcentagemAprovacao = 0.7;
        } else if (tipoEscola.equals("MT")) {
            porcentagemAprovacao = 0.8;
        } else {
            System.out.println("Erro: tipo de escola inválido.");
            System.exit(0);
            return;
        }

        // Verifica se o aluno está aprovado
        if (notaParticipacao < 5) {
            System.out.println("O aluno " + nomeAluno + " foi REPROVADO. Total de pontos: " + notaFinal);
        } else if (notaFinal >= 100 * porcentagemAprovacao) {
            System.out.println("O aluno " + nomeAluno + " foi APROVADO. Total de pontos: " + notaFinal);
        } else {
            System.out.println("O aluno " + nomeAluno + " foi REPROVADO. Total de pontos: " + notaFinal);
        }
    }

}
