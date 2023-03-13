package poo.exercicios;

import java.time.LocalDate;

public class Pessoa {

    public String nome;
    public String sobrenome;
    public LocalDate dataNascimento;
    public int altura;

    public String nomeCompleto(){
        return  nome + " " + sobrenome;
    }

    public int idade(){
        if (dataNascimento == null){
            return 0;
        }
        return dataNascimento.getYear() - LocalDate.now().getYear();
    }
}
