package poo.exercicios.vendas;

import java.util.Random;

//codigo, nome, comissao
public class Vendedor {

    public long codigo;
    public String nome;
    public double comissao;

    public Vendedor(String nome, double comissao) {
        this.codigo = new Random().nextInt();
        this.nome = nome;
        this.comissao = comissao;
    }
}
