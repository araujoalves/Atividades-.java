import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class ExemploData {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean dataValida = false;
        while (!dataValida) {
            System.out.println("Digite a data (dd/mm/aaaa):");
            String dataString = input.nextLine();
            try {
                LocalDate data = LocalDate.parse(dataString, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                LocalDate dataAtual = LocalDate.now();
                if (data.isEqual(dataAtual) || data.isAfter(dataAtual)) {
                    System.out.println("Data válida!");
                    System.out.println(data);
                    dataValida = true;
                } else {
                    System.out.println(data + " é inválida!");
                }
            } catch (DateTimeParseException e) {
                System.out.println("Data inválida!");
                System.out.println("Tente novamente com uma data válida, como " + LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + ".");
            }
        }
    }
}
