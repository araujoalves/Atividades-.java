package poo;

public class Contato {

    public String nome;

    public Telefone[] telefones = new Telefone[4];

    public static void imprimirTelefone(final Telefone telefone) {
        if (null != telefone) {
            System.out.println("\tTipo:" + telefone.tipo + ": " + telefone.numero);
        }
    }

    public void inserirTelefone(final String tipo, final String numero) {

        if (-1 != verificaSeExiste(numero)) {
            System.out.println("Telefone ja existe");
            return;
        }

        final Telefone fone = new Telefone();
        fone.tipo = tipo;
        fone.numero = numero;

        int index = -1;

        for (int i = 0; i < this.telefones.length; i++) {
            if (null == telefones[i]) {
                index = i;
                break;
            }
        }
        if (-1 != index) {
            this.telefones[index] = fone;
            System.out.println("Inserido com sucesso");
        } else {
            System.out.println("Limite execido");
        }
    }

    public void removerTelefone(final String numero) {

        final int index = this.verificaSeExiste(numero);
        if (-1 != index) {
            this.telefones[index] = null;
        }
    }

    public int verificaSeExiste(final String numero) {
        int index = -1;
        for (int i = 0; i < this.telefones.length; i++) {

            if (null != telefones[i] && this.telefones[i].numero.equals(numero)) {
                index = i;
                break;
            }

        }
        return index;
    }

    public void imprimirTelefones() {
        for (final Telefone telefone : this.telefones) {
            Contato.imprimirTelefone(telefone);
        }
        System.out.println();
    }

}
