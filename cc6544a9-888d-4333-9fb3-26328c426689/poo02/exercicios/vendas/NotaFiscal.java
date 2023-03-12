package poo.exercicios.vendas;

import java.util.Random;

//codigo, Cliente, Vendedo, ItensNotaFiscal, totalNota
public class NotaFiscal {

    public long codigo;
    public Cliente cliente;
    public Vendedor vendedor;
    public ItemNotaFiscal[] itensNotaFiscal;
    public double totalNota;

    public int numeroItem;

    public NotaFiscal(Cliente cliente, Vendedor vendedor) {
        codigo = new Random().nextInt();
        numeroItem = 0;
        this.cliente = cliente;
        this.vendedor = vendedor;
        itensNotaFiscal = new ItemNotaFiscal[5];
    }

    public void adicionaItem(Produto produto, int quantidade){
        if (numeroItem == 5){
            return;
        }
        itensNotaFiscal[numeroItem] = new ItemNotaFiscal(produto, quantidade);
        numeroItem++;
    }

    public double calcularTotal(){
        for (ItemNotaFiscal item : itensNotaFiscal) {
            if (item != null) {
                totalNota += item.produto.precoVenda() * item.quatidade;
            }
        }
        return totalNota;
    }
}
