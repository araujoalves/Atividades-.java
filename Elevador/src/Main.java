public class Main {
    public static void main(String[] args) {
        Elevador elevador = new Elevador(10, 5); // capacidade = 10, total de andares = 5

        elevador.entra();
        elevador.entra();
        System.out.println("Pessoas presentes: " + elevador.getPessoasPresentes()); // saída: Pessoas presentes: 2

        elevador.sobe();
        elevador.sobe();
        elevador.sobe();
        System.out.println("Andar atual: " + elevador.getAndarAtual()); // saída: Andar atual: 3

        elevador.sai();
        System.out.println("Pessoas presentes: " + elevador.getPessoasPresentes()); // saída: Pessoas presentes: 1

        elevador.desce();
        elevador.desce();
        elevador.desce();
        elevador.desce();
        System.out.println("Andar atual: " + elevador.getAndarAtual()); // saída: Andar atual: 0

        elevador.inicializa(8, 7); // reconfigura capacidade = 8, total de andares = 7
        System.out.println("Capacidade: " + elevador.getCapacidade()); // saída: Capacidade: 8
        System.out.println("Total de andares: " + elevador.getTotalAndares()); // saída: Total de andares: 7
        System.out.println("Pessoas presentes: " + elevador.getPessoasPresentes()); // saída: Pessoas presentes: 0
        System.out.println("Andar atual: " + elevador.getAndarAtual()); // saída: Andar atual: 0
    }
}