package poo.exercicios.vendas;

public enum Aplicacao {
    ;

    public static void main(String[] args) {

        Cliente cliente = new Cliente("PF", "0000000000", "Ana");
        Vendedor vendedorJoao = new Vendedor("Joao", 0.5);

        Produto produto1 = new Produto("Celular", 199.00, 1.5);
        Produto produto2 = new Produto("Capinha", 4, 2);

        NotaFiscal notaFiscal = new NotaFiscal(cliente, vendedorJoao);
        notaFiscal.adicionaItem(produto1, 3);
        notaFiscal.adicionaItem(produto2, 4);

        System.out.println("O total venda é " + notaFiscal.calcularTotal());

    }

}
