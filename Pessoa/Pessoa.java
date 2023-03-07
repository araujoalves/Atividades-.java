package Pessoa;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
    private String nome, sobrenome;
    private LocalDate dataNascimento;
    private double altura;

    public Pessoa(final String nome, final String sobrenome, final LocalDate dataNascimento, final double altura) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
    }

    public String getNomeCompleto() {
        return this.nome + " " + this.sobrenome;
    }

    public int getIdade() {
        final LocalDate hoje = LocalDate.now();
        return Period.between(this.dataNascimento, hoje).getYears();
    }

    // getters e setters
    public String getNome() {
        return this.nome;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public void setSobrenome(final String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public LocalDate getDataNascimento() {
        return this.dataNascimento;
    }

    public void setDataNascimento(final LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(final double altura) {
        this.altura = altura;
    }
}



