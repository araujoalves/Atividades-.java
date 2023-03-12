package poo;

public class Contato {

    public String nome;

    public Telefone[] telefones = new Telefone[4];

    public Contato(String nome) {
        this.nome = nome;
    }

    public void inserirTelefone(String tipo, String numero){

        if (verificaSeExiste(numero) != -1){
            System.out.println("Telefone ja existe");
            return;
        }

        Telefone fone = new Telefone();
        fone.tipo = tipo;
        fone.numero = numero;

        int index = -1;

        for (int i = 0; i < telefones.length; i++) {
            if (telefones[i] == null){
                index = i;
                break;
            }
        }
        if (index != -1) {
            telefones[index] = fone;
            System.out.println("Inserido com sucesso");
        }else{
            System.out.println("Limite execido");
        }
    }

    public void removerTelefone(String numero){

        int index = verificaSeExiste(numero);
        if (index != -1){
            telefones[index] = null;
        }
    }

    public int verificaSeExiste(String numero){
        int index = -1;
        for (int i = 0; i < telefones.length; i++) {

            if (telefones[i] != null && telefones[i].numero.equals(numero)) {
                index = i;
                break;
            }

        }
        return index;
    }

    public void imprimirTelefones(){
        for (Telefone telefone : telefones) {
            imprimirTelefone(telefone);
        }
        System.out.println();
    }

    public static void imprimirTelefone(Telefone telefone){
        if (telefone != null) {
            System.out.println("\tTipo:" + telefone.tipo + ": " + telefone.numero);
        }
    }

}
