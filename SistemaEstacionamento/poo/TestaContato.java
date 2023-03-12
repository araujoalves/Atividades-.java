package poo;

public class TestaContato {

    public static void main(String[] args) {

        Telefone casa = new Telefone();
        casa.numero = "32322922";
        casa.tipo = "Fixo";

        Estado estado = new Estado();
        estado.nome = "São Paulo";
        estado.sigla = "SP";
        estado.pais = "Brasil";

        Endereco endereco = new Endereco();
        endereco.rua = "Av Paulista";
        endereco.numero = 1050;
        endereco.cep = "99999-999";
        endereco.bairro = "Paraiso";
        endereco.estado = estado;

        Contato contato = new Contato();
        contato.nome = "Aline";
        contato.telefone = casa;
        contato.endereco = endereco;

        System.out.println("Nome: " + contato.nome);
        System.out.println("Telefone: " + contato.telefone.numero);
        System.out.println("Tipo: " + contato.telefone.tipo);

        System.out.println(contato.endereco.estado.pais);


    }

}
