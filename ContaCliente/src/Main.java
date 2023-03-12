

public class Main {

        public static void main(String[] args) {

                Cliente cliente1 = new Cliente("123.456.789-00", "João da Silva");
                Cliente cliente2 = new Cliente("987.654.321-00", "Maria da Silva");

                Conta conta1 = new Conta(cliente1, 1000.0);
                Conta conta2 = new Conta(cliente2, 500.0);

                System.out.println("Saldo conta 1: " + conta1.getSaldo());
                System.out.println("Nome do cliente da conta 1: " + conta1.getCliente().getNome());
                System.out.println("Saldo conta 2: " + conta2.getSaldo());
                System.out.println("Nome do cliente da conta 2: " + conta2.getCliente().getNome());

                conta1.transferir(conta2, 500.0);

                System.out.println("Saldo conta 1 após transferência: " + conta1.getSaldo());
                System.out.println("Saldo conta 2 após transferência: " + conta2.getSaldo());
        }
}