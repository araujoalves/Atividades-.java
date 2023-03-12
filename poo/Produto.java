package poo.exercicios.vendas;


import java.util.Random;

//codigo, nome, precoCusto, margemLucro. e um metodo que retone o preco de venda (precoCusto * margemLucro)
public class Produto {

    public long codigo;
    public String nome;
    public double precoCusto;
    public double margenPrecificacao;

    public Produto(String nome, double precoCusto, double margenPrecificacao) {
        codigo = new Random().nextInt();
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.margenPrecificacao = margenPrecificacao;
    }

    public double precoVenda() {

        //regra de negocio

        return precoCusto * margenPrecificacao;
    }
}
