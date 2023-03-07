package Pessoa;

import java.time.LocalDate;

public enum Aplicacao {
    ;

    public static void main(final String[] args) {
        final LocalDate dataNascimento = LocalDate.of(1982, 2, 1);
        final Pessoa pessoa = new Pessoa("Daniel", "Araujo", dataNascimento, 1.80);

        System.out.println("Nome completo: " + pessoa.getNomeCompleto());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("altura: " + pessoa.getAltura());
    }

}
