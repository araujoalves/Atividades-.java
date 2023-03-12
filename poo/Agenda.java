package poo;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

    public List<Contato> listContatos;

    public Agenda() {
        listContatos = new ArrayList<>();
    }

    public void adicionarContato(Contato contato) {
        listContatos.add(contato);
    }

    public Contato recuperaContato(String nome) {
        for (Contato contato : listContatos) {
            if (nome.equals(contato.nome)) {
                return contato;
            }
        }
        return null;
    }

    public void removeContato(String nome) {
        int index = 0;
        for (int i = 0; i < listContatos.size(); i++) {
            Contato contato = listContatos.get(i);
            if (nome.equals(contato.nome)) {
                index = i;
                break;
            }
        }
        listContatos.remove(index);
    }

}
