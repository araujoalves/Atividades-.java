package poo;

public enum TestaContato {
    ;

    public static void main(String[] args) {
        Contato contato = new Contato("Aline");

        Agenda agenda = new Agenda();

        agenda.adicionarContato(contato);

        Contato contato1 = new Contato("Ana");
        agenda.adicionarContato(contato1);

        Contato contato2 = new Contato("Mariana");
        agenda.adicionarContato(contato2);


        for (Contato ctt : agenda.listContatos) {
            System.out.println(ctt.nome);
        }

        Contato contatoAna = agenda.recuperaContato("Ana");
        contatoAna.nome = "Ana Maria";

        for (Contato ctt : agenda.listContatos) {
            System.out.println(ctt.nome);
        }

    }

}
