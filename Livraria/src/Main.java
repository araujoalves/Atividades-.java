
import java.time.LocalDate;
public class Main {

        public static void main(String[] args) {
            Pessoa pessoa1 = new Pessoa("Daniel", 25, "Rua A, 123", "123456789");
            Livro livro1 = new Livro("Java para leigos", "Barry Burd", 2013, true);
            LocalDate dataEmprestimo1 = LocalDate.now();
            LocalDate dataDevolucao1 = LocalDate.of(2023, 3, 19);

            Emprestimo emprestimo1 = new Emprestimo(pessoa1, livro1, dataEmprestimo1, dataDevolucao1);

            System.out.println("Emprestimo 1:");
            System.out.println("Pessoa: " + emprestimo1.getPessoa().getNome());
            System.out.println("Livro: " + emprestimo1.getLivro().getTitulo());
            System.out.println("Data de empréstimo: " + emprestimo1.getDataEmprestimo());
            System.out.println("Data de devolução: " + emprestimo1.getDataDevolucao());
        }
    }
