

import java.util.List;
import java.util.ArrayList;

public class Supermercado {
    public static void main(String[] args) {
        Produto arroz = new Produto("Arroz", 10.0, 20);
        Produto feijao = new Produto("Feijão", 6.0, 30);

        List<Produto> produtos = new ArrayList<>();
        produtos.add(arroz);
        produtos.add(feijao);

        Pedido pedido = new Pedido(produtos);

        System.out.println("Valor total do pedido: R$ " + pedido.getValorTotal());
        System.out.println("Forma de pagamento: dinheiro");
    }
    }


