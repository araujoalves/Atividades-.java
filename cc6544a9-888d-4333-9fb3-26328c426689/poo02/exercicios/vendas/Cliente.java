package poo.exercicios.vendas;

import java.util.Random;

//codigo, cpf/cnpj, tipo PF ou PJ, nome
public class Cliente {
    public long codigo;
    public String cpfCnpj;
    public String tipo;
    public String nome;

    public Cliente(){
    }

    public Cliente(String tipo){
        this.tipo = tipo;
    }

    public Cliente(String tipo, String nome){
        this.nome = nome;
        this.tipo = tipo;
    }
    public Cliente(String tipo, String cpfCnpj, String nome){
        codigo = new Random().nextInt();
        this.tipo = tipo;
        this.cpfCnpj = cpfCnpj;
        this.nome = nome;
    }


}
