package poo.exercicios.vendas;

import java.util.Random;

//codigo, Produto, quantidade
public class ItemNotaFiscal {

    public long codigo;
    public Produto produto;
    public int quatidade;

    public ItemNotaFiscal(Produto produto, int quatidade) {
        codigo = new Random().nextInt();
        this.produto = produto;
        this.quatidade = quatidade;
    }
}
