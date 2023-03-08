package poo;

public class Contato {

    public String nome;

    public Telefone[] telefones = new Telefone[4];

    public Contato(String nome) {
        this.nome = nome;
    }

    public static void imprimirTelefone(Telefone telefone) {
        if (null != telefone) {
            System.out.println("\tTipo:" + telefone.tipo + ": " + telefone.numero);
        }
    }

    public void inserirTelefone(String tipo, String numero) {

        if (-1 != this.verificaSeExiste(numero)) {
            System.out.println("Telefone ja existe");
            return;
        }

        Telefone fone = new Telefone();
        fone.tipo = tipo;
        fone.numero = numero;

        int index = -1;

        for (int i = 0; i < telefones.length; i++) {
            if (null == this.telefones[i]) {
                index = i;
                break;
            }
        }
        if (-1 != index) {
            telefones[index] = fone;
            System.out.println("Inserido com sucesso");
        } else {
            System.out.println("Limite execido");
        }
    }

    public void removerTelefone(String numero) {

        int index = verificaSeExiste(numero);
        if (-1 != index) {
            telefones[index] = null;
        }
    }

    public int verificaSeExiste(String numero) {
        int index = -1;
        for (int i = 0; i < telefones.length; i++) {

            if (null != this.telefones[i] && telefones[i].numero.equals(numero)) {
                index = i;
                break;
            }

        }
        return index;
    }

    public void imprimirTelefones() {
        for (Telefone telefone : telefones) {
            imprimirTelefone(telefone);
        }
        System.out.println();
    }

}
