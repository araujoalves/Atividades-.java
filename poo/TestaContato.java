package poo;

public enum TestaContato {
    ;

    public static void main(final String[] args) {
        final Contato contato = new Contato();


        contato.nome = "Aline";
        final boolean inserido = false;

        contato.inserirTelefone("Casa", "32322922");
        contato.inserirTelefone("Comercial", "32322922");
        contato.inserirTelefone("Celular1", "99900998");
        contato.inserirTelefone("Celular2", "77889900");

        contato.telefones[0] = new Telefone();


        if (!inserido) {
            System.out.println("Maximo de numeros exedidos");
        }

        System.out.println("Nome: " + contato.nome);
        contato.imprimirTelefones();

        contato.removerTelefone("32322922");

        System.out.println("Nome: " + contato.nome);
        contato.imprimirTelefones();
    }

}
