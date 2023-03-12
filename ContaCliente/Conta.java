public class Conta {

        private Cliente cliente;
        private double saldo;

        public Conta(Cliente cliente, double saldo) {
            this.cliente = cliente;
            this.saldo = saldo;
        }

        public void depositar(double valor) {
            saldo += valor;
        }

        public double sacar(double valor) {
            if (saldo >= valor) {
                saldo -= valor;
                return valor;
            }
            return 0.0;
        }

        public void transferir(Conta destino, double valor) {
            if (saldo >= valor) {
                saldo -= valor;
                destino.depositar(valor);
                System.out.println("Transferência realizada com sucesso");
            } else {
                System.out.println("Saldo insuficiente para realizar a transferência");
            }
        }

        public Cliente getCliente() {
            return cliente;
        }

        public double getSaldo() {
            return saldo;
        }

}
